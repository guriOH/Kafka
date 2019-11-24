package com.sample.demo.consumer;

import com.sample.demo.producer.ProducerBasicSample;

public class ConsumerApplication {

  public static void main(String[] args) {
    ConsumerBasicSample kafkaSample = new ConsumerBasicSample();
    kafkaSample.consumer();
  }
}
