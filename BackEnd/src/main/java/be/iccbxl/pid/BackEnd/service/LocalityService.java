package be.iccbxl.pid.BackEnd.service;

import be.iccbxl.pid.BackEnd.model.Locality;
import be.iccbxl.pid.BackEnd.repository.LocalityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LocalityService {

    @Autowired
    private LocalityRepository repository;

    public List<Locality> getAllLocalities() {
        List<Locality> localities = new ArrayList<>();

        repository.findAll().forEach(localities::add);

        return localities;
    }

    public Optional<Locality> getLocality(Long id) {
        return repository.findById(id);
    }

    public void add(Locality locality) {
        repository.save(locality);
    }

    public void update(String id, Locality locality) {
        repository.save(locality);
    }

    public void delete(String id) {
        Long indice = (long) Integer.parseInt(id);

        repository.deleteById(indice);
    }

}
