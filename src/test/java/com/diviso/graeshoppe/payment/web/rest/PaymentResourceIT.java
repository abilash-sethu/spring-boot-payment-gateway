package com.diviso.graeshoppe.payment.web.rest;

import com.diviso.graeshoppe.payment.PaymentApp;
import com.diviso.graeshoppe.payment.config.TestSecurityConfiguration;
import com.diviso.graeshoppe.payment.domain.Payment;
import com.diviso.graeshoppe.payment.repository.PaymentRepository;
import com.diviso.graeshoppe.payment.repository.search.PaymentSearchRepository;
import com.diviso.graeshoppe.payment.service.PaymentService;
import com.diviso.graeshoppe.payment.service.dto.PaymentDTO;
import com.diviso.graeshoppe.payment.service.mapper.PaymentMapper;
import com.diviso.graeshoppe.payment.web.rest.errors.ExceptionTranslator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.Validator;

import javax.persistence.EntityManager;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.List;

import static com.diviso.graeshoppe.payment.web.rest.TestUtil.createFormattingConversionService;
import static org.assertj.core.api.Assertions.assertThat;
import static org.elasticsearch.index.query.QueryBuilders.queryStringQuery;
import static org.hamcrest.Matchers.hasItem;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Integration tests for the {@link PaymentResource} REST controller.
 */
@SpringBootTest(classes = {PaymentApp.class, TestSecurityConfiguration.class})
public class PaymentResourceIT {

    private static final String DEFAULT_REF = "AAAAAAAAAA";
    private static final String UPDATED_REF = "BBBBBBBBBB";

    private static final String DEFAULT_PAYEE = "AAAAAAAAAA";
    private static final String UPDATED_PAYEE = "BBBBBBBBBB";

    private static final String DEFAULT_PAYER = "AAAAAAAAAA";
    private static final String UPDATED_PAYER = "BBBBBBBBBB";

    private static final String DEFAULT_TARGET_ID = "AAAAAAAAAA";
    private static final String UPDATED_TARGET_ID = "BBBBBBBBBB";

    private static final String DEFAULT_PAYMENT_TYPE = "AAAAAAAAAA";
    private static final String UPDATED_PAYMENT_TYPE = "BBBBBBBBBB";

    private static final String DEFAULT_PROVIDER = "AAAAAAAAAA";
    private static final String UPDATED_PROVIDER = "BBBBBBBBBB";

    private static final Double DEFAULT_AMOUNT = 1D;
    private static final Double UPDATED_AMOUNT = 2D;

    private static final Double DEFAULT_TAX = 1D;
    private static final Double UPDATED_TAX = 2D;

    private static final Double DEFAULT_TOTAL = 1D;
    private static final Double UPDATED_TOTAL = 2D;

    private static final String DEFAULT_STATUS = "AAAAAAAAAA";
    private static final String UPDATED_STATUS = "BBBBBBBBBB";

    private static final Instant DEFAULT_DATE_AND_TIME = Instant.ofEpochMilli(0L);
    private static final Instant UPDATED_DATE_AND_TIME = Instant.now().truncatedTo(ChronoUnit.MILLIS);

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private PaymentMapper paymentMapper;

    @Autowired
    private PaymentService paymentService;

    /**
     * This repository is mocked in the com.diviso.graeshoppe.payment.repository.search test package.
     *
     * @see com.diviso.graeshoppe.payment.repository.search.PaymentSearchRepositoryMockConfiguration
     */
    @Autowired
    private PaymentSearchRepository mockPaymentSearchRepository;

    @Autowired
    private MappingJackson2HttpMessageConverter jacksonMessageConverter;

    @Autowired
    private PageableHandlerMethodArgumentResolver pageableArgumentResolver;

    @Autowired
    private ExceptionTranslator exceptionTranslator;

    @Autowired
    private EntityManager em;

    @Autowired
    private Validator validator;

    private MockMvc restPaymentMockMvc;

    private Payment payment;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        final PaymentResource paymentResource = new PaymentResource(paymentService);
        this.restPaymentMockMvc = MockMvcBuilders.standaloneSetup(paymentResource)
            .setCustomArgumentResolvers(pageableArgumentResolver)
            .setControllerAdvice(exceptionTranslator)
            .setConversionService(createFormattingConversionService())
            .setMessageConverters(jacksonMessageConverter)
            .setValidator(validator).build();
    }

    /**
     * Create an entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static Payment createEntity(EntityManager em) {
        Payment payment = new Payment()
            .ref(DEFAULT_REF)
            .payee(DEFAULT_PAYEE)
            .payer(DEFAULT_PAYER)
            .targetId(DEFAULT_TARGET_ID)
            .paymentType(DEFAULT_PAYMENT_TYPE)
            .provider(DEFAULT_PROVIDER)
            .amount(DEFAULT_AMOUNT)
            .tax(DEFAULT_TAX)
            .total(DEFAULT_TOTAL)
            .status(DEFAULT_STATUS)
            .dateAndTime(DEFAULT_DATE_AND_TIME);
        return payment;
    }
    /**
     * Create an updated entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static Payment createUpdatedEntity(EntityManager em) {
        Payment payment = new Payment()
            .ref(UPDATED_REF)
            .payee(UPDATED_PAYEE)
            .payer(UPDATED_PAYER)
            .targetId(UPDATED_TARGET_ID)
            .paymentType(UPDATED_PAYMENT_TYPE)
            .provider(UPDATED_PROVIDER)
            .amount(UPDATED_AMOUNT)
            .tax(UPDATED_TAX)
            .total(UPDATED_TOTAL)
            .status(UPDATED_STATUS)
            .dateAndTime(UPDATED_DATE_AND_TIME);
        return payment;
    }

    @BeforeEach
    public void initTest() {
        payment = createEntity(em);
    }

    @Test
    @Transactional
    public void createPayment() throws Exception {
        int databaseSizeBeforeCreate = paymentRepository.findAll().size();

        // Create the Payment
        PaymentDTO paymentDTO = paymentMapper.toDto(payment);
        restPaymentMockMvc.perform(post("/api/payments")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(paymentDTO)))
            .andExpect(status().isCreated());

        // Validate the Payment in the database
        List<Payment> paymentList = paymentRepository.findAll();
        assertThat(paymentList).hasSize(databaseSizeBeforeCreate + 1);
        Payment testPayment = paymentList.get(paymentList.size() - 1);
        assertThat(testPayment.getRef()).isEqualTo(DEFAULT_REF);
        assertThat(testPayment.getPayee()).isEqualTo(DEFAULT_PAYEE);
        assertThat(testPayment.getPayer()).isEqualTo(DEFAULT_PAYER);
        assertThat(testPayment.getTargetId()).isEqualTo(DEFAULT_TARGET_ID);
        assertThat(testPayment.getPaymentType()).isEqualTo(DEFAULT_PAYMENT_TYPE);
        assertThat(testPayment.getProvider()).isEqualTo(DEFAULT_PROVIDER);
        assertThat(testPayment.getAmount()).isEqualTo(DEFAULT_AMOUNT);
        assertThat(testPayment.getTax()).isEqualTo(DEFAULT_TAX);
        assertThat(testPayment.getTotal()).isEqualTo(DEFAULT_TOTAL);
        assertThat(testPayment.getStatus()).isEqualTo(DEFAULT_STATUS);
        assertThat(testPayment.getDateAndTime()).isEqualTo(DEFAULT_DATE_AND_TIME);

        // Validate the Payment in Elasticsearch
        verify(mockPaymentSearchRepository, times(1)).save(testPayment);
    }

    @Test
    @Transactional
    public void createPaymentWithExistingId() throws Exception {
        int databaseSizeBeforeCreate = paymentRepository.findAll().size();

        // Create the Payment with an existing ID
        payment.setId(1L);
        PaymentDTO paymentDTO = paymentMapper.toDto(payment);

        // An entity with an existing ID cannot be created, so this API call must fail
        restPaymentMockMvc.perform(post("/api/payments")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(paymentDTO)))
            .andExpect(status().isBadRequest());

        // Validate the Payment in the database
        List<Payment> paymentList = paymentRepository.findAll();
        assertThat(paymentList).hasSize(databaseSizeBeforeCreate);

        // Validate the Payment in Elasticsearch
        verify(mockPaymentSearchRepository, times(0)).save(payment);
    }


    @Test
    @Transactional
    public void getAllPayments() throws Exception {
        // Initialize the database
        paymentRepository.saveAndFlush(payment);

        // Get all the paymentList
        restPaymentMockMvc.perform(get("/api/payments?sort=id,desc"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(payment.getId().intValue())))
            .andExpect(jsonPath("$.[*].ref").value(hasItem(DEFAULT_REF)))
            .andExpect(jsonPath("$.[*].payee").value(hasItem(DEFAULT_PAYEE)))
            .andExpect(jsonPath("$.[*].payer").value(hasItem(DEFAULT_PAYER)))
            .andExpect(jsonPath("$.[*].targetId").value(hasItem(DEFAULT_TARGET_ID)))
            .andExpect(jsonPath("$.[*].paymentType").value(hasItem(DEFAULT_PAYMENT_TYPE)))
            .andExpect(jsonPath("$.[*].provider").value(hasItem(DEFAULT_PROVIDER)))
            .andExpect(jsonPath("$.[*].amount").value(hasItem(DEFAULT_AMOUNT.doubleValue())))
            .andExpect(jsonPath("$.[*].tax").value(hasItem(DEFAULT_TAX.doubleValue())))
            .andExpect(jsonPath("$.[*].total").value(hasItem(DEFAULT_TOTAL.doubleValue())))
            .andExpect(jsonPath("$.[*].status").value(hasItem(DEFAULT_STATUS)))
            .andExpect(jsonPath("$.[*].dateAndTime").value(hasItem(DEFAULT_DATE_AND_TIME.toString())));
    }
    
    @Test
    @Transactional
    public void getPayment() throws Exception {
        // Initialize the database
        paymentRepository.saveAndFlush(payment);

        // Get the payment
        restPaymentMockMvc.perform(get("/api/payments/{id}", payment.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.id").value(payment.getId().intValue()))
            .andExpect(jsonPath("$.ref").value(DEFAULT_REF))
            .andExpect(jsonPath("$.payee").value(DEFAULT_PAYEE))
            .andExpect(jsonPath("$.payer").value(DEFAULT_PAYER))
            .andExpect(jsonPath("$.targetId").value(DEFAULT_TARGET_ID))
            .andExpect(jsonPath("$.paymentType").value(DEFAULT_PAYMENT_TYPE))
            .andExpect(jsonPath("$.provider").value(DEFAULT_PROVIDER))
            .andExpect(jsonPath("$.amount").value(DEFAULT_AMOUNT.doubleValue()))
            .andExpect(jsonPath("$.tax").value(DEFAULT_TAX.doubleValue()))
            .andExpect(jsonPath("$.total").value(DEFAULT_TOTAL.doubleValue()))
            .andExpect(jsonPath("$.status").value(DEFAULT_STATUS))
            .andExpect(jsonPath("$.dateAndTime").value(DEFAULT_DATE_AND_TIME.toString()));
    }

    @Test
    @Transactional
    public void getNonExistingPayment() throws Exception {
        // Get the payment
        restPaymentMockMvc.perform(get("/api/payments/{id}", Long.MAX_VALUE))
            .andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    public void updatePayment() throws Exception {
        // Initialize the database
        paymentRepository.saveAndFlush(payment);

        int databaseSizeBeforeUpdate = paymentRepository.findAll().size();

        // Update the payment
        Payment updatedPayment = paymentRepository.findById(payment.getId()).get();
        // Disconnect from session so that the updates on updatedPayment are not directly saved in db
        em.detach(updatedPayment);
        updatedPayment
            .ref(UPDATED_REF)
            .payee(UPDATED_PAYEE)
            .payer(UPDATED_PAYER)
            .targetId(UPDATED_TARGET_ID)
            .paymentType(UPDATED_PAYMENT_TYPE)
            .provider(UPDATED_PROVIDER)
            .amount(UPDATED_AMOUNT)
            .tax(UPDATED_TAX)
            .total(UPDATED_TOTAL)
            .status(UPDATED_STATUS)
            .dateAndTime(UPDATED_DATE_AND_TIME);
        PaymentDTO paymentDTO = paymentMapper.toDto(updatedPayment);

        restPaymentMockMvc.perform(put("/api/payments")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(paymentDTO)))
            .andExpect(status().isOk());

        // Validate the Payment in the database
        List<Payment> paymentList = paymentRepository.findAll();
        assertThat(paymentList).hasSize(databaseSizeBeforeUpdate);
        Payment testPayment = paymentList.get(paymentList.size() - 1);
        assertThat(testPayment.getRef()).isEqualTo(UPDATED_REF);
        assertThat(testPayment.getPayee()).isEqualTo(UPDATED_PAYEE);
        assertThat(testPayment.getPayer()).isEqualTo(UPDATED_PAYER);
        assertThat(testPayment.getTargetId()).isEqualTo(UPDATED_TARGET_ID);
        assertThat(testPayment.getPaymentType()).isEqualTo(UPDATED_PAYMENT_TYPE);
        assertThat(testPayment.getProvider()).isEqualTo(UPDATED_PROVIDER);
        assertThat(testPayment.getAmount()).isEqualTo(UPDATED_AMOUNT);
        assertThat(testPayment.getTax()).isEqualTo(UPDATED_TAX);
        assertThat(testPayment.getTotal()).isEqualTo(UPDATED_TOTAL);
        assertThat(testPayment.getStatus()).isEqualTo(UPDATED_STATUS);
        assertThat(testPayment.getDateAndTime()).isEqualTo(UPDATED_DATE_AND_TIME);

        // Validate the Payment in Elasticsearch
        verify(mockPaymentSearchRepository, times(1)).save(testPayment);
    }

    @Test
    @Transactional
    public void updateNonExistingPayment() throws Exception {
        int databaseSizeBeforeUpdate = paymentRepository.findAll().size();

        // Create the Payment
        PaymentDTO paymentDTO = paymentMapper.toDto(payment);

        // If the entity doesn't have an ID, it will throw BadRequestAlertException
        restPaymentMockMvc.perform(put("/api/payments")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(paymentDTO)))
            .andExpect(status().isBadRequest());

        // Validate the Payment in the database
        List<Payment> paymentList = paymentRepository.findAll();
        assertThat(paymentList).hasSize(databaseSizeBeforeUpdate);

        // Validate the Payment in Elasticsearch
        verify(mockPaymentSearchRepository, times(0)).save(payment);
    }

    @Test
    @Transactional
    public void deletePayment() throws Exception {
        // Initialize the database
        paymentRepository.saveAndFlush(payment);

        int databaseSizeBeforeDelete = paymentRepository.findAll().size();

        // Delete the payment
        restPaymentMockMvc.perform(delete("/api/payments/{id}", payment.getId())
            .accept(TestUtil.APPLICATION_JSON_UTF8))
            .andExpect(status().isNoContent());

        // Validate the database contains one less item
        List<Payment> paymentList = paymentRepository.findAll();
        assertThat(paymentList).hasSize(databaseSizeBeforeDelete - 1);

        // Validate the Payment in Elasticsearch
        verify(mockPaymentSearchRepository, times(1)).deleteById(payment.getId());
    }

    @Test
    @Transactional
    public void searchPayment() throws Exception {
        // Initialize the database
        paymentRepository.saveAndFlush(payment);
        when(mockPaymentSearchRepository.search(queryStringQuery("id:" + payment.getId()), PageRequest.of(0, 20)))
            .thenReturn(new PageImpl<>(Collections.singletonList(payment), PageRequest.of(0, 1), 1));
        // Search the payment
        restPaymentMockMvc.perform(get("/api/_search/payments?query=id:" + payment.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(payment.getId().intValue())))
            .andExpect(jsonPath("$.[*].ref").value(hasItem(DEFAULT_REF)))
            .andExpect(jsonPath("$.[*].payee").value(hasItem(DEFAULT_PAYEE)))
            .andExpect(jsonPath("$.[*].payer").value(hasItem(DEFAULT_PAYER)))
            .andExpect(jsonPath("$.[*].targetId").value(hasItem(DEFAULT_TARGET_ID)))
            .andExpect(jsonPath("$.[*].paymentType").value(hasItem(DEFAULT_PAYMENT_TYPE)))
            .andExpect(jsonPath("$.[*].provider").value(hasItem(DEFAULT_PROVIDER)))
            .andExpect(jsonPath("$.[*].amount").value(hasItem(DEFAULT_AMOUNT.doubleValue())))
            .andExpect(jsonPath("$.[*].tax").value(hasItem(DEFAULT_TAX.doubleValue())))
            .andExpect(jsonPath("$.[*].total").value(hasItem(DEFAULT_TOTAL.doubleValue())))
            .andExpect(jsonPath("$.[*].status").value(hasItem(DEFAULT_STATUS)))
            .andExpect(jsonPath("$.[*].dateAndTime").value(hasItem(DEFAULT_DATE_AND_TIME.toString())));
    }
}
