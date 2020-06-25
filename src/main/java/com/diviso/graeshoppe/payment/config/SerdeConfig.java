package com.diviso.graeshoppe.payment.config;
import java.util.Collections;
import java.util.Map;

import org.apache.avro.specific.SpecificRecordBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import io.confluent.kafka.serializers.AbstractKafkaAvroSerDeConfig;
import io.confluent.kafka.streams.serdes.avro.SpecificAvroSerializer;

public class SerdeConfig<T extends SpecificRecordBase> extends SpecificAvroSerializer<T> {

	private static Logger log = LoggerFactory.getLogger("Logger SerdeConfig");
	@Value("${spring.cloud.stream.schemaRegistryClient.endpoint:}")
	private String schemaRegistryEndpoint="http://dev.servers.divisosofttech.com:8081";

	@Override
	public void configure(Map<String, ?> serializerConfig, boolean isSerializerForRecordKeys) {
		log.info("Schema registry client uri is "+schemaRegistryEndpoint);
		log.info("Enter into SerdeConfig " + serializerConfig);
		final Map<String, String> serdeConfig = Collections
				.singletonMap(AbstractKafkaAvroSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG, schemaRegistryEndpoint);
		super.configure(serdeConfig, isSerializerForRecordKeys);
	}
}