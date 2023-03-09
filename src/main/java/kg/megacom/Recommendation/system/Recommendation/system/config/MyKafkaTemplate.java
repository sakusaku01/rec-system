package kg.megacom.Recommendation.system.Recommendation.system.config;

import kg.megacom.Recommendation.system.Recommendation.system.model.request.LoginRequest;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Log4j
public class MyKafkaTemplate {

    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;


    public void sendMessage(LoginRequest loginRequest){
        log.info(String.format("Message sent -> %s", loginRequest));
        kafkaTemplate.send("recommendationFirst", loginRequest);
    }
}
