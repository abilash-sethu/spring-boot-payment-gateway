package com.diviso.graeshoppe.payment.service;

import com.diviso.graeshoppe.payment.client.braintree.models.PaymentTransaction;
import com.diviso.graeshoppe.payment.client.braintree.models.PaymentTransactionResponse;
import com.diviso.graeshoppe.payment.client.braintree.models.RefundResponse;

public interface BraintreeCommandService {

	String getClientToken();

	PaymentTransactionResponse createTransaction(PaymentTransaction paymentTransaction);

	RefundResponse createRefund(String transactionId,Double amount);

}
