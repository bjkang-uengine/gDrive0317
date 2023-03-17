package gdrive.domain;

import gdrive.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "bbAgregates",
    path = "bbAgregates"
)
public interface BbAgregateRepository
    extends PagingAndSortingRepository<BbAgregate, Long> {}
