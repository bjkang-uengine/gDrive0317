package gdrive.infra;

import gdrive.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class BbAgregateHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<BbAgregate>> {

    @Override
    public EntityModel<BbAgregate> process(EntityModel<BbAgregate> model) {
        return model;
    }
}
