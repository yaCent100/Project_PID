package be.iccbxl.pid.BackEnd.repository;

import be.iccbxl.pid.BackEnd.model.Locality;
import org.springframework.data.repository.CrudRepository;


public interface LocalityRepository extends CrudRepository<Locality, Long> {
    Locality findByPostalCode(String postalCode);
    Locality findByLocality(String locality);

}
