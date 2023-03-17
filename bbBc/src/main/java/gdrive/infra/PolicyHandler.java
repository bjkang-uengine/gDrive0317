package gdrive.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import gdrive.config.kafka.KafkaProcessor;
import gdrive.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PolicyHandler {

    @Autowired
    BbAgregateRepository bbAgregateRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='AaEvent'"
    )
    public void wheneverAaEvent_BbPolicy(@Payload AaEvent aaEvent) {
        AaEvent event = aaEvent;
        System.out.println("\n\n##### listener BbPolicy : " + aaEvent + "\n\n");

        // Sample Logic //
        BbAgregate.bbPolicy(event);
    }
}
