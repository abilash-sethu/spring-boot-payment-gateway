package com.diviso.graeshoppe.payment.service.dto;
import java.time.Instant;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.diviso.graeshoppe.payment.domain.Payment} entity.
 */
public class PaymentDTO implements Serializable {

    private Long id;

    private String ref;

    private String payee;

    private String payer;

    private String targetId;

    private String paymentType;

    private String provider;

    private Double amount;

    private Double tax;

    private Double total;

    private String status;

    private Instant dateAndTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Instant getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(Instant dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PaymentDTO paymentDTO = (PaymentDTO) o;
        if (paymentDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), paymentDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "PaymentDTO{" +
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
