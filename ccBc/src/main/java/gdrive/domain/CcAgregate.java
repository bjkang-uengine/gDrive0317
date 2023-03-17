package gdrive.domain;

import gdrive.CcBcApplication;
import gdrive.domain.CcEvent;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "CcAgregate_table")
@Data
public class CcAgregate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fileid;

    private String fileurl;

    @PostPersist
    public void onPostPersist() {
        CcEvent ccEvent = new CcEvent(this);
        ccEvent.publishAfterCommit();
    }

    public static CcAgregateRepository repository() {
        CcAgregateRepository ccAgregateRepository = CcBcApplication.applicationContext.getBean(
            CcAgregateRepository.class
        );
        return ccAgregateRepository;
    }

    //<<< Clean Arch / Port Method
    public static void ccPolicy(BbEvent bbEvent) {
        /** Example 1:  new item 
        CcAgregate ccAgregate = new CcAgregate();
        repository().save(ccAgregate);

        */

        /** Example 2:  finding and process
        
        repository().findById(bbEvent.get???()).ifPresent(ccAgregate->{
            
            ccAgregate // do something
            repository().save(ccAgregate);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
