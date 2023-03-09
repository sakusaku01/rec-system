package kg.megacom.Recommendation.system.Recommendation.system.controller;

import kg.megacom.Recommendation.system.Recommendation.system.config.MyKafkaTemplate;
import kg.megacom.Recommendation.system.Recommendation.system.model.request.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/tst")
public class TestController {

    @Autowired
    private MyKafkaTemplate myKafkaTemplate;

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody LoginRequest loginRequest){
        myKafkaTemplate.sendMessage(loginRequest);
        return ResponseEntity.ok("Message sent to kafka topic");
    }
}
