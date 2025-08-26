package fca.cifca.titulacion.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "grado")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GradoModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "grad_id_grado")
    private int idGrado;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn (name = "grad_id_nivel_grado",  nullable = true)
    private NivelGradoModel nivelGrado;

    @Column (name = "grad_nombre",  nullable = false, length = 150)
    private String nombre;


}