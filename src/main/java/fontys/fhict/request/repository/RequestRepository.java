package fontys.fhict.request.repository;

import fontys.fhict.request.entity.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;

public interface RequestRepository extends JpaRepository<Request, Long> {
    ArrayList<Request> findAllByBreederId(long id);
}
