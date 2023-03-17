package gdrive.domain;

import gdrive.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "aaAgregates",
    path = "aaAgregates"
)
public interface AaAgregateRepository
    extends PagingAndSortingRepository<AaAgregate, Long> {}
