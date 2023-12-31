package be.iccbxl.pid.BackEnd.restController;

import be.iccbxl.pid.BackEnd.model.Artist;
import be.iccbxl.pid.BackEnd.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class ArtistRestController {

    @Autowired
    ArtistService artistService;

    @GetMapping("/artists")
    public List<Artist> index() {
        return artistService.getAllArtists();
    }
    @GetMapping("/artists/{id}")
    public Artist show(@PathVariable("id") Long id) {
        return artistService.getArtist(id);
    }



}
