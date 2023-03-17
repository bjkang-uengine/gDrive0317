package gdrive.domain;

import gdrive.domain.*;
import gdrive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class AaEvent extends AbstractEvent {

    private Long id;
    private String name;
    private Integer size;
    private String userid;
}
