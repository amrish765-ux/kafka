package net.javaguides.springbootkafkatutorial.kafka;

import net.javaguides.springbootkafkatutorial.payload.User;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static final Logger LOGGER= LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "javaguides_json",groupId = "myGroup")
    public void consume(User user){
        LOGGER.info(String.format("Json message reciecved ->%s",user.toString()));
    }
}
