package gdrive.domain;

import gdrive.AaBcApplication;
import gdrive.domain.AaEvent;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "AaAgregate_table")
@Data
public class AaAgregate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private Integer size;

    private String userid;

    @PostPersist
    public void onPostPersist() {
        AaEvent aaEvent = new AaEvent(this);
        aaEvent.publishAfterCommit();
    }

    public static AaAgregateRepository repository() {
        AaAgregateRepository aaAgregateRepository = AaBcApplication.applicationContext.getBean(
            AaAgregateRepository.class
        );
        return aaAgregateRepository;
    }
}
