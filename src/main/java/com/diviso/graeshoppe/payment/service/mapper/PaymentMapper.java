package com.diviso.graeshoppe.payment.service.mapper;

import com.diviso.graeshoppe.payment.domain.*;
import com.diviso.graeshoppe.payment.service.dto.PaymentDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Payment} and its DTO {@link PaymentDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface PaymentMapper extends EntityMapper<PaymentDTO, Payment> {



    default Payment fromId(Long id) {
        if (id == null) {
            return null;
        }
        Payment payment = new Payment();
        payment.setId(id);
        return payment;
    }
}
