package be.iccbxl.pid.BackEnd.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;
import org.hibernate.type.descriptor.jdbc.NVarcharJdbcType;
import org.springframework.data.annotation.Id;

@Data
@Entity
public class Utilisateur {

    @Id
    private int id;

    @Column
    private NVarcharJdbcType userName;


}
