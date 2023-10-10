package be.iccbxl.pid.BackEnd.repository;

import be.iccbxl.pid.BackEnd.model.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LocationRepository extends CrudRepository<Location, Long> {

    Location findByDesignation(String designation);
    Optional<Location> findById(Long id);


}
