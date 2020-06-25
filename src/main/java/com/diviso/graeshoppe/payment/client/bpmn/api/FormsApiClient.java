package com.diviso.graeshoppe.payment.client.bpmn.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.diviso.graeshoppe.payment.client.bpmn.ClientConfiguration;

@FeignClient(name="${bpmn.name:bpmn}", url="${bpmn.url}", configuration = ClientConfiguration.class)
public interface FormsApiClient extends FormsApi {
}