package gdrive.domain;

import gdrive.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class CcEvent extends AbstractEvent {

    private Long id;
    private String fileid;
    private String fileurl;
}
