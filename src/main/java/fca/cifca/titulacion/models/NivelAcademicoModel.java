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

    @Column(name = "niac_orden")
    private Integer nivelAcademicoOrden;

    @Column(name = "niac_abv1", length = 10)
    private String nivelAcademicoAbv1;

    @Column(name = "niac_abv2", length = 10)
    private String nivelAcademicoAbv2;

}