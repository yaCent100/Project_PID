package be.iccbxl.pid.BackEnd.model;

import com.github.slugify.Slugify;
import jakarta.persistence.*;
import lombok.*;

@Data
@ToString
@NoArgsConstructor(force = true, access = AccessLevel.PROTECTED)
@Entity
@Table(name="locations")
public class Location {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(unique=true)
    private String slug;

    private String designation;
    private String address;

    @ManyToOne
    @JoinColumn(name="locality_id", nullable=false)
    private Locality locality;

    private String website;
    private String phone;

    public Location(String slug, String designation, String address, Locality locality, String website, String phone) {
        Slugify slg = new Slugify();

        this.slug = slg.slugify(designation);
        this.designation = designation;
        this.address = address;
        this.locality = locality;
        this.website = website;
        this.phone = phone;
    }

    private void setSlug(String slug) {
        this.slug = slug;
    }

    public void setDesignation(String designation) {
        this.designation = designation;

        Slugify slg = new Slugify();

        this.setSlug(slg.slugify(designation));

    }


    public void setLocality(Locality locality) {
        this.locality.removeLocation(this);	//déménager de l’ancienne localité
        this.locality = locality;
        this.locality.addLocation(this);		//emménager dans la nouvelle localité
    }



}