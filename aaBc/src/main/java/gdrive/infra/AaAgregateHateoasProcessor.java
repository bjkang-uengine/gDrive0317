package gdrive.infra;

import gdrive.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class AaAgregateHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<AaAgregate>> {

    @Override
    public EntityModel<AaAgregate> process(EntityModel<AaAgregate> model) {
        return model;
    }
}
