package fca.cifca.titulacion.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "division")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DivisionModel {

    @Id
    @Column (name = "divi_id_division")
    private String idDivision;

    @Column (name = "divi_nombre", nullable = false, length = 100)
    private String nombreDivision;

}
