package be.iccbxl.pid.BackEnd.restController;

import be.iccbxl.pid.BackEnd.model.Role;
import be.iccbxl.pid.BackEnd.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import static java.util.Optional.ofNullable;

@RestController
@CrossOrigin
public class RoleRestController {

    @Autowired
    RoleService roleService;

    @GetMapping("/roles")
    public List<Role> index() {
        return roleService.getAllRoles();
    }

    @GetMapping("/roles/{id}")
    public Optional<Role> show(@PathVariable("id") Long id) {
        return roleService.getRole(id);
    }


}
