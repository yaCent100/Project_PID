package be.iccbxl.pid.BackEnd.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor(force = true, access = AccessLevel.PROTECTED)
@Entity
@Table(name="artists")
public class Artist {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;

    @Override
    public String toString() {
        return firstname + " " + lastname;
    }

}


