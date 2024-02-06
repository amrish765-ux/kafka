package net.javaguides.springbootkafkatutorial.kafka;

import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;

@Service
public class KafkaProducer {

    private static final Logger logger=LoggerFactory.getLogger(KafkaProducer.class);

    private KafkaTemplate<String,String>kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    public void sendMessage(String message){
        logger.info(String.format("Message sent %s",message));
        kafkaTemplate.send("javaguides",message);
    }
}
