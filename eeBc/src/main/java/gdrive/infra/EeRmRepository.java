package gdrive.infra;

import gdrive.domain.*;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "eeRms", path = "eeRms")
public interface EeRmRepository extends PagingAndSortingRepository<EeRm, Long> {
    List<EeRm> findByFileid(String fileid);
}
