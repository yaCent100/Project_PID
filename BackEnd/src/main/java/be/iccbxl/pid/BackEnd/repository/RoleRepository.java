package be.iccbxl.pid.BackEnd.repository;

import be.iccbxl.pid.BackEnd.model.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long>{
    Role findByRole(String role);
}
