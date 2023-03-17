package gdrive.domain;

import gdrive.domain.*;
import gdrive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CcEvent extends AbstractEvent {

    private Long id;
    private String fileid;
    private String fileurl;

    public CcEvent(CcAgregate aggregate) {
        super(aggregate);
    }

    public CcEvent() {
        super();
    }
}
