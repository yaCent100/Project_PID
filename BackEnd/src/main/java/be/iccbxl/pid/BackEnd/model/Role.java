package be.iccbxl.pid.BackEnd.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.*;
import jakarta.persistence.Id;


@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor(force = true, access = AccessLevel.PROTECTED)
@Entity
@Table(name="roles")
public class Role {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String role;

}
