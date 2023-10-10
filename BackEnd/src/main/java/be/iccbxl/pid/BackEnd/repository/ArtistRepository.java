package be.iccbxl.pid.BackEnd.repository;

import be.iccbxl.pid.BackEnd.model.Artist;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArtistRepository extends CrudRepository<Artist, Long> {

        List<Artist> findByLastname(String lastname);

        Artist findById(long id);

    }
