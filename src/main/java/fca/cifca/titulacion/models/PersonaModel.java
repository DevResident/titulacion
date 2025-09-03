package fca.cifca.titulacion.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table (name = "persona")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pers_id_persona")
    private int pers_id_persona;

    @Column(name = "pers_nombre", length = 40, nullable = true)
    private String pers_nombre;

    //De acuerdo al datasource, TODAS estas son opcionales.
    @Column(name = "pers_apaterno", length = 35, nullable = true)
    private String pers_apaterno;

    @Column(name = "pers_amaterno", length = 35, nullable = true)
    private String pers_amaterno;

    @Column(name = "pers_rfc", length = 13, nullable = true)
    private String pers_rfc;

    @Column(name = "Pers_curp", length = 18, nullable = true)
    private String pers_curp;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pers_id_area")
    private AreaModel area;

/*
    @Column(name = "pers_id_area", nullable = true)
    private int pers_id_area;*/

    // Relación con país
    @ManyToOne(fetch = FetchType.LAZY) // LAZY para que no cargue siempre el país
    @JoinColumn(name = "pers_id_pais", referencedColumnName = "pais_id_pais", nullable = false)
    private PaisModel pers_id_pais;

    @Column(name = "pers_fec_nac", nullable = true)
    private Date pers_fec_nac;

    @Column(name = "pers_sexo", length = 2, nullable = true)
    private String pers_sexo;

    //Ni idea de tipo de qué, los registros no ayudan tampoco (A o null).
    @Column(name = "pers_tipo", nullable = true)
    private char pers_tipo;

    @Column(name = "pers_no_inmigrante", length = 10, nullable = true)
    private String pers_no_inmigrante;

    @Column(name = "pers_foto_titular", length = 200, nullable = true)
    private String pers_foto_titular;

    //TBA grado académico, este creo sí importa.

    @Column(name = "pers_cedula_identidad", length = 20, nullable = true)
    private String pers_cedula_identidad;



    //Estos ya existen, por qué uno separado para acento????????
    @Column(name = "pers_nombre_acento", length = 40, nullable = true)
    private String pers_nombre_acento;

    @Column(name = "pers_primer_apellido_acento", length = 45, nullable = true)
    private String pers_primer_apellido_acento;

    @Column(name = "pers_segundo_apellido_acento", length = 45, nullable = true)
    private String pers_segundo_apellido_acento;

}