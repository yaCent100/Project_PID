package be.iccbxl.pid.BackEnd.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor(force = true, access = AccessLevel.PROTECTED)
@Entity
@Table(name="localities")
public class Locality {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String postalCode;
    private String locality;

}
