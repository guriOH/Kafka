package com.sample.demo.producer;

public class ProducerApplication {

  public static void main(String[] args) {
    ProducerBasicSample kafkaSample = new ProducerBasicSample();
    kafkaSample.producer();
  }
}
