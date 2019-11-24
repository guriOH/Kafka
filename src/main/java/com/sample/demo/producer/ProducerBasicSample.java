package com.sample.demo.producer;

import java.util.Properties;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class ProducerBasicSample {

  ProducerBasicSample() {

  }

  public void producer() {
    Properties props = new Properties();
    props.put("bootstrap.servers", "localhost:9092");
    props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
    props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
    props.put("request.required.acks", "1");

    Producer<Integer, String> producer = new KafkaProducer(props);

    String topic = "Example";
    String message = " hoon ";
    ProducerRecord<Integer, String> data = new ProducerRecord<Integer, String>(
        topic, message
    );

    producer.send(data);
    producer.close();
  }
}
