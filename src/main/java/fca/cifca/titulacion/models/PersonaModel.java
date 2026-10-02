package fca.cifca.titulacion.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Entity
@Table (name = "persona")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pers_id_persona")
    private Integer pers_id_persona;

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

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pers_id_area", nullable = true)
    private AreaModel area;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pers_id_puesto", nullable = true)
    private PuestoModel puesto;

    @Column(name = "pers_tipo_puesto", nullable = true, length = 2)
    private String pers_tipo_puesto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pers_id_estudio_profesional")
    private EstudioProfesionalModel estudioProfesional;

    @Column(name = "pers_es_temporal", nullable = true, length = 2)
    private String pers_es_temporal;

    // Relación con país
    @ManyToOne(fetch = FetchType.LAZY) // LAZY para que no cargue siempre el país
    @JoinColumn(name = "pers_id_pais", referencedColumnName = "pais_id_pais", nullable = false)
    private PaisModel pers_id_pais;

    @Column(name = "pers_fec_nac", nullable = true)
    private LocalDate pers_fec_nac;

    @Column(name = "pers_sexo", length = 2, nullable = true)
    private String pers_sexo;

    //Ni idea de tipo de qué, los registros no ayudan tampoco (A o null).
    @Column(name = "pers_tipo", nullable = true)
    private String pers_tipo;

    @Column(name = "pers_no_inmigrante", length = 10, nullable = true)
    private String pers_no_inmigrante;

    @Column(name = "pers_foto_titular", length = 200, nullable = true)
    private String pers_foto_titular;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pers_id_grado_academico", nullable = true)
    private GradoModel pers_grado_academico;

    @Column(name = "pers_cedula_identidad", length = 20, nullable = true)
    private String pers_cedula_identidad;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pers_id_domicilio", nullable = true)
    private DomicilioModel domicilio;

    //Estos ya existen, por qué uno separado para acento????????
    @Column(name = "pers_nombre_acento", length = 40, nullable = true)
    private String pers_nombre_acento;

    @Column(name = "pers_primer_apellido_acento", length = 45, nullable = true)
    private String pers_primer_apellido_acento;

    @Column(name = "pers_segundo_apellido_acento", length = 45, nullable = true)
    private String pers_segundo_apellido_acento;

}