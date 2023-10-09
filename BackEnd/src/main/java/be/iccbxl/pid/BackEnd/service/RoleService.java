package be.iccbxl.pid.BackEnd.service;

import be.iccbxl.pid.BackEnd.model.Role;
import be.iccbxl.pid.BackEnd.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RoleService {

    @Autowired
    private RoleRepository repository;

    public List<Role> getAllRoles() {
        List<Role> roles = new ArrayList<>();

        repository.findAll().forEach(roles::add);

        return roles;
    }

    public Optional<Role> getRole(Long id) {
        return repository.findById(id);
    }

    public void add(Role role) {
        repository.save(role);
    }

    public void update(String id, Role role) {
        repository.save(role);
    }

    public void delete(String id) {
        Long indice = (long) Integer.parseInt(id);

        repository.deleteById(indice);
    }

}
