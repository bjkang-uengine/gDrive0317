package gdrive.domain;

import gdrive.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class BbEvent extends AbstractEvent {

    private Long id;
    private String indexkey;
    private String fileid;
}
