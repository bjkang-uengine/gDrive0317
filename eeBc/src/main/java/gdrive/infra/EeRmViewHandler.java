package gdrive.infra;

import gdrive.config.kafka.KafkaProcessor;
import gdrive.domain.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class EeRmViewHandler {

    @Autowired
    private EeRmRepository eeRmRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenAaEvent_then_CREATE_1(@Payload AaEvent aaEvent) {
        try {
            if (!aaEvent.validate()) return;

            // view 객체 생성
            EeRm eeRm = new EeRm();
            // view 객체에 이벤트의 Value 를 set 함
            eeRm.setFileid(aaEvent.getId());
            eeRm.setFilesize(String.valueOf(aaEvent.getSize()));
            eeRm.setUserid(aaEvent.getUserid());
            eeRm.setFilename(aaEvent.getName());
            eeRm.setIsFileUpload(true);
            // view 레파지 토리에 save
            eeRmRepository.save(eeRm);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenBbEvent_then_UPDATE_1(@Payload BbEvent bbEvent) {
        try {
            if (!bbEvent.validate()) return;
            // view 객체 조회

            List<EeRm> eeRmList = eeRmRepository.findByFileid(
                bbEvent.getFileid()
            );
            for (EeRm eeRm : eeRmList) {
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                eeRm.setIsFileIndexed(true);
                // view 레파지 토리에 save
                eeRmRepository.save(eeRm);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenCcEvent_then_UPDATE_2(@Payload CcEvent ccEvent) {
        try {
            if (!ccEvent.validate()) return;
            // view 객체 조회

            List<EeRm> eeRmList = eeRmRepository.findByFileid(
                ccEvent.getFileid()
            );
            for (EeRm eeRm : eeRmList) {
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                eeRm.setFileUrl(ccEvent.getFileurl());
                // view 레파지 토리에 save
                eeRmRepository.save(eeRm);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
