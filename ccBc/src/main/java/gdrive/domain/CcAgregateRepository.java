package gdrive.domain;

import gdrive.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "ccAgregates",
    path = "ccAgregates"
)
public interface CcAgregateRepository
    extends PagingAndSortingRepository<CcAgregate, Long> {}
