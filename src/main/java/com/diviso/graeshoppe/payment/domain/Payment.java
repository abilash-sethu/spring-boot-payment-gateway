package com.diviso.graeshoppe.payment.domain;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import org.springframework.data.elasticsearch.annotations.FieldType;
import java.io.Serializable;
import java.time.Instant;

/**
 * A Payment.
 */
@Entity
@Table(name = "payment")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@org.springframework.data.elasticsearch.annotations.Document(indexName = "payment")
public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @org.springframework.data.elasticsearch.annotations.Field(type = FieldType.Keyword)
    private Long id;

    @Column(name = "ref")
    private String ref;

    @Column(name = "payee")
    private String payee;

    @Column(name = "payer")
    private String payer;

    @Column(name = "target_id")
    private String targetId;

    @Column(name = "payment_type")
    private String paymentType;

    @Column(name = "provider")
    private String provider;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "tax")
    private Double tax;

    @Column(name = "total")
    private Double total;

    @Column(name = "status")
    private String status;

    @Column(name = "date_and_time")
    private Instant dateAndTime;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public Payment ref(String ref) {
        this.ref = ref;
        return this;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getPayee() {
        return payee;
    }

    public Payment payee(String payee) {
        this.payee = payee;
        return this;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }

    public String getPayer() {
        return payer;
    }

    public Payment payer(String payer) {
        this.payer = payer;
        return this;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    public String getTargetId() {
        return targetId;
    }

    public Payment targetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public Payment paymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getProvider() {
        return provider;
    }

    public Payment provider(String provider) {
        this.provider = provider;
        return this;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public Double getAmount() {
        return amount;
    }

    public Payment amount(Double amount) {
        this.amount = amount;
        return this;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getTax() {
        return tax;
    }

    public Payment tax(Double tax) {
        this.tax = tax;
        return this;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getTotal() {
        return total;
    }

    public Payment total(Double total) {
        this.total = total;
        return this;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getStatus() {
        return status;
    }

    public Payment status(String status) {
        this.status = status;
        return this;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Instant getDateAndTime() {
        return dateAndTime;
    }

    public Payment dateAndTime(Instant dateAndTime) {
        this.dateAndTime = dateAndTime;
        return this;
    }

    public void setDateAndTime(Instant dateAndTime) {
        this.dateAndTime = dateAndTime;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Payment)) {
            return false;
        }
        return id != null && id.equals(((Payment) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "Payment{" +
            "id=" + getId() +
            ", ref='" + getRef() + "'" +
            ", payee='" + getPayee() + "'" +
            ", payer='" + getPayer() + "'" +
            ", targetId='" + getTargetId() + "'" +
            ", paymentType='" + getPaymentType() + "'" +
            ", provider='" + getProvider() + "'" +
            ", amount=" + getAmount() +
            ", tax=" + getTax() +
            ", total=" + getTotal() +
            ", status='" + getStatus() + "'" +
            ", dateAndTime='" + getDateAndTime() + "'" +
            "}";
    }
}
