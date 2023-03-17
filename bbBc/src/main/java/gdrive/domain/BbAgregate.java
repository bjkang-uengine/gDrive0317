package gdrive.domain;

import gdrive.BbBcApplication;
import gdrive.domain.BbEvent;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "BbAgregate_table")
@Data
public class BbAgregate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String indexkey;

    private String fileid;

    @PostPersist
    public void onPostPersist() {
        BbEvent bbEvent = new BbEvent(this);
        bbEvent.publishAfterCommit();
    }

    public static BbAgregateRepository repository() {
        BbAgregateRepository bbAgregateRepository = BbBcApplication.applicationContext.getBean(
            BbAgregateRepository.class
        );
        return bbAgregateRepository;
    }

    //<<< Clean Arch / Port Method
    public static void bbPolicy(AaEvent aaEvent) {
        /** Example 1:  new item 
        BbAgregate bbAgregate = new BbAgregate();
        repository().save(bbAgregate);

        */

        /** Example 2:  finding and process
        
        repository().findById(aaEvent.get???()).ifPresent(bbAgregate->{
            
            bbAgregate // do something
            repository().save(bbAgregate);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
