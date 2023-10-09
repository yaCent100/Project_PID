package be.iccbxl.pid.BackEnd.restController;

import be.iccbxl.pid.BackEnd.model.Artist;
import be.iccbxl.pid.BackEnd.model.Type;
import be.iccbxl.pid.BackEnd.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class TypeRestController {

    @Autowired
    TypeService typeService;

    @GetMapping("/types")
    public List<Type> index() {
        return typeService.getAllTypes();
    }

    @GetMapping("/types/{id}")
    public Optional<Type> show(@PathVariable("id") Long id) {
        return typeService.getType(id);
    }



}
