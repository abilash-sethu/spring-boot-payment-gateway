package com.diviso.graeshoppe.payment.repository.search;

import com.diviso.graeshoppe.payment.domain.Payment;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the {@link Payment} entity.
 */
public interface PaymentSearchRepository extends ElasticsearchRepository<Payment, Long> {
}
