package com.diviso.graeshoppe.payment.service.mapper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class NotificationMapperTest {

    private NotificationMapper notificationMapper;

    @BeforeEach
    public void setUp() {
        notificationMapper = new NotificationMapperImpl();
    }

    @Test
    public void testEntityFromId() {
        Long id = 2L;
        assertThat(notificationMapper.fromId(id).getId()).isEqualTo(id);
        assertThat(notificationMapper.fromId(null)).isNull();
    }
}
