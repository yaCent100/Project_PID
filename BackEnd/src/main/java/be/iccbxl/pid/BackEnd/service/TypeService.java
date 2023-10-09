package be.iccbxl.pid.BackEnd.service;

import be.iccbxl.pid.BackEnd.model.Type;
import be.iccbxl.pid.BackEnd.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TypeService {

    @Autowired
    private TypeRepository typeRepository;

    public List<Type> getAllTypes() {
        List<Type> types = new ArrayList<>();

        typeRepository.findAll().forEach(types::add);

        return types;
    }
    public Optional<Type> getType(Long id){
        return typeRepository.findById(id);

    }

    public void addType(Type type) {
        typeRepository.save(type);
    }

    public void updateType(String id, Type type) {
        typeRepository.save(type);
    }

    public void deleteType(String id) {
        Long indice = (long) Integer.parseInt(id);

        typeRepository.deleteById(indice);
    }



}
