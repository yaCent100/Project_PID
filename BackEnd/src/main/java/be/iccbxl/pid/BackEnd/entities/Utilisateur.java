package be.iccbxl.pid.BackEnd.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.type.descriptor.jdbc.NVarcharJdbcType;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private NVarcharJdbcType username;

    @Column
    private NVarcharJdbcType password;

    @Column
    private NVarcharJdbcType firstName;

    @Column
    private NVarcharJdbcType lastName;

    @Column
    private NVarcharJdbcType email;


}
