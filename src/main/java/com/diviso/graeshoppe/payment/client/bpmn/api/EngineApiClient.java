package com.diviso.graeshoppe.payment.client.bpmn.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.diviso.graeshoppe.payment.client.bpmn.ClientConfiguration;

@FeignClient(name="${bpmn.name:bpmn}", url="${bpmn.url:http://localhost:8080/activiti-rest/service}", configuration = ClientConfiguration.class)
public interface EngineApiClient extends EngineApi {
}