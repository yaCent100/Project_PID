package be.iccbxl.pid.BackEnd.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor(force = true, access = AccessLevel.PROTECTED)
@Entity
@Table(name="localities")
public class Locality {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private int locality;


}
