package be.iccbxl.pid.BackEnd.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor(force = true, access = AccessLevel.PROTECTED)
@Entity
@Table(name="types")
public class Type {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String type;

}
