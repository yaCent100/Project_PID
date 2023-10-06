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
@Table(name="types")
public class Type {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String auteur;
    private String scenographe;
    private String comedien;
}
