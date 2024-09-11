package com.learnkafka.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LibraryEventsProducer {

    private final KafkaTemplate<Integer, String> kafkaTemplate;

}