package gdrive.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "EeRm_table")
@Data
public class EeRm {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String fileid;
    private String filesize;
    private String filename;
    private String userid;
    private Boolean isFileUpload;
    private Boolean isFileIndexed;
    private String fileUrl;
}
