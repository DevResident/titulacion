package fca.cifca.titulacion.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "nivel_academico")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NivelAcademicoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "niac_id_nivel_academico")
    private Integer idNivelAcademico;

    @Column(name = "niac_descripcion", length = 20)
    private String descripcionNivelAcademico;



}
