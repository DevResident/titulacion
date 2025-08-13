package fca.cifca.titulacion.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table (name = "persona")

public class PersonaModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "pers_id_persona")
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

    /*
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pers_id_area")
    private AreaModel area;
    */

    @Column(name = "pers_id_area", nullable = true)
    private int pers_id_area;

    @Column(name = "pers_id_puesto", nullable = true)
    private int pers_id_puesto;

    @Column(name = "pers_tipo_puesto", length = 2, nullable = true)
    private int pers_tipo_puesto;

    //Consultar si es relevante para titulación,
    // para ver si es join column.
    @Column(name = "pers_id_estudio_profesional")
    private int pers_id_estudio_profesional;

    @Column(name = "pers_es_temporal", length = 2, nullable = true)
    private String pers_es_temporal;

    @Column(name = "pers_id_pais", nullable = true)
    private int pers_id_pais;

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

    @Column(name = "pers_id_domicilio", nullable = true)
    private int pers_id_domicilio;

    //Estos ya existen, por qué uno separado para acento????????
    @Column(name = "pers_nombre_acento", length = 40, nullable = true)
    private String pers_nombre_acento;

    @Column(name = "pers_primer_apellido_acento", length = 45, nullable = true)
    private String pers_primer_apellido_acento;

    @Column(name = "pers_segundo_apellido_acento", length = 45, nullable = true)
    private String pers_segundo_apellido_acento;

    public int getPers_id_persona() {
        return pers_id_persona;
    }

    public void setPers_id_persona(int pers_id_persona) {
        this.pers_id_persona = pers_id_persona;
    }

    public String getPers_nombre() {
        return pers_nombre;
    }

    public void setPers_nombre(String pers_nombre) {
        this.pers_nombre = pers_nombre;
    }

    public String getPers_apaterno() {
        return pers_apaterno;
    }

    public void setPers_apaterno(String pers_apaterno) {
        this.pers_apaterno = pers_apaterno;
    }

    public String getPers_amaterno() {
        return pers_amaterno;
    }

    public void setPers_amaterno(String pers_amaterno) {
        this.pers_amaterno = pers_amaterno;
    }

    public String getPers_rfc() {
        return pers_rfc;
    }

    public void setPers_rfc(String pers_rfc) {
        this.pers_rfc = pers_rfc;
    }

    public String getPers_curp() {
        return pers_curp;
    }

    public void setPers_curp(String pers_curp) {
        this.pers_curp = pers_curp;
    }

    public int getPers_id_area() {
        return pers_id_area;
    }

    public void setPers_id_area(int pers_id_area) {
        this.pers_id_area = pers_id_area;
    }

    public int getPers_id_puesto() {
        return pers_id_puesto;
    }

    public void setPers_id_puesto(int pers_id_puesto) {
        this.pers_id_puesto = pers_id_puesto;
    }

    public int getPers_tipo_puesto() {
        return pers_tipo_puesto;
    }

    public void setPers_tipo_puesto(int pers_tipo_puesto) {
        this.pers_tipo_puesto = pers_tipo_puesto;
    }

    public int getPers_id_estudio_profesional() {
        return pers_id_estudio_profesional;
    }

    public void setPers_id_estudio_profesional(int pers_id_estudio_profesional) {
        this.pers_id_estudio_profesional = pers_id_estudio_profesional;
    }

    public String getPers_es_temporal() {
        return pers_es_temporal;
    }

    public void setPers_es_temporal(String pers_es_temporal) {
        this.pers_es_temporal = pers_es_temporal;
    }

    public int getPers_id_pais() {
        return pers_id_pais;
    }

    public void setPers_id_pais(int pers_id_pais) {
        this.pers_id_pais = pers_id_pais;
    }

    public Date getPers_fec_nac() {
        return pers_fec_nac;
    }

    public void setPers_fec_nac(Date pers_fec_nac) {
        this.pers_fec_nac = pers_fec_nac;
    }

    public String getPers_sexo() {
        return pers_sexo;
    }

    public void setPers_sexo(String pers_sexo) {
        this.pers_sexo = pers_sexo;
    }

    public char getPers_tipo() {
        return pers_tipo;
    }

    public void setPers_tipo(char pers_tipo) {
        this.pers_tipo = pers_tipo;
    }

    public String getPers_no_inmigrante() {
        return pers_no_inmigrante;
    }

    public void setPers_no_inmigrante(String pers_no_inmigrante) {
        this.pers_no_inmigrante = pers_no_inmigrante;
    }

    public String getPers_foto_titular() {
        return pers_foto_titular;
    }

    public void setPers_foto_titular(String pers_foto_titular) {
        this.pers_foto_titular = pers_foto_titular;
    }

    public String getPers_cedula_identidad() {
        return pers_cedula_identidad;
    }

    public void setPers_cedula_identidad(String pers_cedula_identidad) {
        this.pers_cedula_identidad = pers_cedula_identidad;
    }

    public int getPers_id_domicilio() {
        return pers_id_domicilio;
    }

    public void setPers_id_domicilio(int pers_id_domicilio) {
        this.pers_id_domicilio = pers_id_domicilio;
    }

    public String getPers_nombre_acento() {
        return pers_nombre_acento;
    }

    public void setPers_nombre_acento(String pers_nombre_acento) {
        this.pers_nombre_acento = pers_nombre_acento;
    }

    public String getPers_primer_apellido_acento() {
        return pers_primer_apellido_acento;
    }

    public void setPers_primer_apellido_acento(String pers_primer_apellido_acento) {
        this.pers_primer_apellido_acento = pers_primer_apellido_acento;
    }

    public String getPers_segundo_apellido_acento() {
        return pers_segundo_apellido_acento;
    }

    public void setPers_segundo_apellido_acento(String pers_segundo_apellido_acento) {
        this.pers_segundo_apellido_acento = pers_segundo_apellido_acento;
    }

    public PersonaModel(String pers_nombre, String pers_apaterno, String pers_amaterno, String pers_rfc,
                        String pers_curp, int pers_id_area, int pers_id_puesto, int pers_tipo_puesto,
                        int pers_id_estudio_profesional, String pers_es_temporal, int pers_id_pais,
                        Date pers_fec_nac, String pers_sexo, char pers_tipo, String pers_no_inmigrante,
                        String pers_foto_titular, String pers_cedula_identidad, int pers_id_domicilio,
                        String pers_nombre_acento, String pers_primer_apellido_acento,
                        String pers_segundo_apellido_acento) {
        this.pers_nombre = pers_nombre;
        this.pers_apaterno = pers_apaterno;
        this.pers_amaterno = pers_amaterno;
        this.pers_rfc = pers_rfc;
        this.pers_curp = pers_curp;
        this.pers_id_area = pers_id_area;
        this.pers_id_puesto = pers_id_puesto;
        this.pers_tipo_puesto = pers_tipo_puesto;
        this.pers_id_estudio_profesional = pers_id_estudio_profesional;
        this.pers_es_temporal = pers_es_temporal;
        this.pers_id_pais = pers_id_pais;
        this.pers_fec_nac = pers_fec_nac;
        this.pers_sexo = pers_sexo;
        this.pers_tipo = pers_tipo;
        this.pers_no_inmigrante = pers_no_inmigrante;
        this.pers_foto_titular = pers_foto_titular;
        this.pers_cedula_identidad = pers_cedula_identidad;
        this.pers_id_domicilio = pers_id_domicilio;
        this.pers_nombre_acento = pers_nombre_acento;
        this.pers_primer_apellido_acento = pers_primer_apellido_acento;
        this.pers_segundo_apellido_acento = pers_segundo_apellido_acento;
    }

    public PersonaModel() {
    }
}
