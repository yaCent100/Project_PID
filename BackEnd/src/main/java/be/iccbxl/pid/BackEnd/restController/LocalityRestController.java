package be.iccbxl.pid.BackEnd.restController;

import be.iccbxl.pid.BackEnd.model.Locality;
import be.iccbxl.pid.BackEnd.service.LocalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class LocalityRestController {

    @Autowired
    LocalityService localityService;

    @GetMapping("/localities")
    public List<Locality> index2() {
        return localityService.getAllLocalities();

    }
    @GetMapping("/localities/{id}")
    public Optional<Locality> show(@PathVariable("id") Long id) {
        return localityService.getLocality(id);
    }



}
