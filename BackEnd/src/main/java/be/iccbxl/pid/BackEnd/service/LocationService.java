package be.iccbxl.pid.BackEnd.service;

import be.iccbxl.pid.BackEnd.model.Location;
import be.iccbxl.pid.BackEnd.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import java.util.ArrayList;
import java.util.List;

@Service
public class LocationService {

    @Autowired
    private LocationRepository locationRepository;

    public List<Location> getAllLocations() {
        List<Location> locations = new ArrayList<>();

        locationRepository.findAll().forEach(locations::add);

        return locations;
    }

    public Optional<Location> get(Long id) {
        return locationRepository.findById(id);
    }

    public void add(Location location) {
        locationRepository.save(location);
    }

    public void update(String id, Location location) {
        locationRepository.save(location);
    }

    public void delete(String id) {
        Long indice = (long) Integer.parseInt(id);

        locationRepository.deleteById(indice);
    }


}
