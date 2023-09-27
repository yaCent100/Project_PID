package be.iccbxl.pid.BackEnd.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.type.descriptor.jdbc.NVarcharJdbcType;

@Data
@Entity
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private NVarcharJdbcType username;

    @Column
    private NVarcharJdbcType password;


}
