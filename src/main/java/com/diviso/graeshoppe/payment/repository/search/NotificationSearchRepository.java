package com.diviso.graeshoppe.payment.repository.search;

import com.diviso.graeshoppe.payment.domain.Notification;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the {@link Notification} entity.
 */
public interface NotificationSearchRepository extends ElasticsearchRepository<Notification, Long> {
}
