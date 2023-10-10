package be.iccbxl.pid.BackEnd.repository;

import be.iccbxl.pid.BackEnd.model.Type;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface TypeRepository extends CrudRepository<Type, Long> {

    Type findByType(String type);
    Optional<Type> findById(Long id);


}
