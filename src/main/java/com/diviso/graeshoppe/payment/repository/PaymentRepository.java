package com.diviso.graeshoppe.payment.repository;

import com.diviso.graeshoppe.payment.domain.Payment;
import com.diviso.graeshoppe.payment.service.dto.PaymentDTO;

import java.util.Optional;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Payment entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {

	Optional<Payment> findByRef(String transactionId);

}
