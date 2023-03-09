package kg.megacom.Recommendation.system.Recommendation.system.config;

import lombok.extern.log4j.Log4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Log4j
public class KafkaConsumer {

    @KafkaListener(topics = "recommendationFirst",
            groupId ="group_id")
    public void consume(String message){
        log.info(String.format("Message received -> %s", message));
    }

}
