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
@Table(name="roles")
public class Role {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private boolean admin;
    private boolean member;
    private boolean affiliate;
}
