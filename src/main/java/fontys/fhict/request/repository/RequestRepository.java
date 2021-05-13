package fontys.fhict.request.repository;

import fontys.fhict.request.entity.Request;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository extends JpaRepository<Request, Long> {
}
