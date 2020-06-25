package com.diviso.graeshoppe.payment.service;


import com.diviso.graeshoppe.notification.avro.Notification;
import com.diviso.graeshoppe.payment.avro.Payment;
import com.diviso.graeshoppe.payment.config.KafkaProperties;


import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.time.Instant;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
public class KafkaMessagingService {

	private final Logger log = LoggerFactory.getLogger(KafkaMessagingService.class);

	
	@Value("${topic.payment.destination}")
	private String paymentTopic;

	@Value("${topic.notification.destination}")
	private String notificationTopic;
	
	

	
	private final KafkaProperties kafkaProperties;
	private KafkaProducer<String, Payment> paymentProducer;
	private KafkaProducer<String, Notification> notificatonProducer;
	private ExecutorService sseExecutorService = Executors.newCachedThreadPool();

	public KafkaMessagingService(KafkaProperties kafkaProperties) {
		this.kafkaProperties = kafkaProperties;
		this.paymentProducer = new KafkaProducer<>(kafkaProperties.getProducerProps());
		this.notificatonProducer = new KafkaProducer<>(kafkaProperties.getProducerProps());
		
		
	}

	public PublishResult publishPayment(Payment message) throws ExecutionException, InterruptedException {
		RecordMetadata metadata = paymentProducer.send(new ProducerRecord<>(paymentTopic, message)).get();
		return new PublishResult(metadata.topic(), metadata.partition(), metadata.offset(),
				Instant.ofEpochMilli(metadata.timestamp()));
	}

	public PublishResult publishNotification(Notification message) throws ExecutionException, InterruptedException {
		RecordMetadata metadata = notificatonProducer.send(new ProducerRecord<>(notificationTopic, message)).get();
		return new PublishResult(metadata.topic(), metadata.partition(), metadata.offset(),
				Instant.ofEpochMilli(metadata.timestamp()));
	}

	

	public static class PublishResult {
		public final String topic;
		public final int partition;
		public final long offset;
		public final Instant timestamp;

		private PublishResult(String topic, int partition, long offset, Instant timestamp) {
			this.topic = topic;
			this.partition = partition;
			this.offset = offset;
			this.timestamp = timestamp;
		}
	}

	//public void updateOrder(Payment payment) {

		

	//}
}