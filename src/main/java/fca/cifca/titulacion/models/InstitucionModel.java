package fca.cifca.titulacion.models;

import jakarta.persistence.*;

@Entity
@Table (name = "institucion")

public class InstitucionModel {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "inst_id_institucion")
    private int inst_id_institucion;
    @Column (name = "inst_id_institucion_superior", nullable = false)
    private int inst_id_institucion_superior;
    @Column (name = "inst_id_domicilio", nullable = false)
    private int inst_id_domicilio;
    @Column (name = "inst_nombre", nullable = false, length = 200)
    private String inst_nombre;
    @Column (name = "inst_nivel", nullable = false, length = 1)
    private String inst_nivel;
    @Column (name = "inst_tipo", nullable = false, length = 1)
    private String inst_tipo;
    @Column (name = "inst_abreviatura", nullable = false, length = 20)
    private String inst_abreviatura;
    @Column (name = "inst_clave_unam", nullable = false, length = 5)
    private String inst_clave_unam;
    @Column (name = "inst_url_pagina", nullable = false, length = 50)
    private String inst_url_pagina;
    @Column (name = "inst_afiliada_anfeca", nullable = true)
    private Boolean inst_afiliada_anfeca;
    @Column (name = "inst_ruta_logotipo", nullable = false, length = 200)
    private  String inst_ruta_logotipo;
    @Column (name = "inst_sistema", nullable = false, length = 10)
    private String inst_sistema;
    @Column (name = "inst_categoria_unam", nullable = false, length = 15)
    private String inst_categoria_unam;
    @Column (name = "inst_tipo_afiliacion_anfeca", nullable = false)
    private char inst_tipo_afiliacion_afeca;
    @Column (name = "inst_id_institucion_sede", nullable = false)
    private int inst_id_institucion_sede;
    @Column (name = "inst_id_pais", nullable = false)
    private int inst_id_pais;
    @Column (name = "inst_id_sector_servicio", nullable = false)
    private int inst_id_sector_servicio;
    @Column (name = "inst_sector", nullable = false, length = 10)
    private String inst_sector;

    public int getInst_id_institucion() {
        return inst_id_institucion;
    }

    public void setInst_id_institucion(int inst_id_institucion) {
        this.inst_id_institucion = inst_id_institucion;
    }

    public int getInst_id_institucion_superior() {
        return inst_id_institucion_superior;
    }

    public void setInst_id_institucion_superior(int inst_id_institucion_superior) {
        this.inst_id_institucion_superior = inst_id_institucion_superior;
    }

    public int getInst_id_domicilio() {
        return inst_id_domicilio;
    }

    public void setInst_id_domicilio(int inst_id_domicilio) {
        this.inst_id_domicilio = inst_id_domicilio;
    }

    public String getInst_nombre() {
        return inst_nombre;
    }

    public void setInst_nombre(String inst_nombre) {
        this.inst_nombre = inst_nombre;
    }

    public String getInst_nivel() {
        return inst_nivel;
    }

    public void setInst_nivel(String inst_nivel) {
        this.inst_nivel = inst_nivel;
    }

    public String getInst_tipo() {
        return inst_tipo;
    }

    public void setInst_tipo(String inst_tipo) {
        this.inst_tipo = inst_tipo;
    }

    public String getInst_abreviatura() {
        return inst_abreviatura;
    }

    public void setInst_abreviatura(String inst_abreviatura) {
        this.inst_abreviatura = inst_abreviatura;
    }

    public String getInst_clave_unam() {
        return inst_clave_unam;
    }

    public void setInst_clave_unam(String inst_clave_unam) {
        this.inst_clave_unam = inst_clave_unam;
    }

    public String getInst_url_pagina() {
        return inst_url_pagina;
    }

    public void setInst_url_pagina(String inst_url_pagina) {
        this.inst_url_pagina = inst_url_pagina;
    }

    public Boolean getInst_afiliada_anfeca() {
        return inst_afiliada_anfeca;
    }

    public void setInst_afiliada_anfeca(Boolean inst_afiliada_anfeca) {
        this.inst_afiliada_anfeca = inst_afiliada_anfeca;
    }

    public String getInst_ruta_logotipo() {
        return inst_ruta_logotipo;
    }

    public void setInst_ruta_logotipo(String inst_ruta_logotipo) {
        this.inst_ruta_logotipo = inst_ruta_logotipo;
    }

    public String getInst_sistema() {
        return inst_sistema;
    }

    public void setInst_sistema(String inst_sistema) {
        this.inst_sistema = inst_sistema;
    }

    public String getInst_categoria_unam() {
        return inst_categoria_unam;
    }

    public void setInst_categoria_unam(String inst_categoria_unam) {
        this.inst_categoria_unam = inst_categoria_unam;
    }

    public char getInst_tipo_afiliacion_afeca() {
        return inst_tipo_afiliacion_afeca;
    }

    public void setInst_tipo_afiliacion_afeca(char inst_tipo_afiliacion_afeca) {
        this.inst_tipo_afiliacion_afeca = inst_tipo_afiliacion_afeca;
    }

    public int getInst_id_institucion_sede() {
        return inst_id_institucion_sede;
    }

    public void setInst_id_institucion_sede(int inst_id_institucion_sede) {
        this.inst_id_institucion_sede = inst_id_institucion_sede;
    }

    public int getInst_id_pais() {
        return inst_id_pais;
    }

    public void setInst_id_pais(int inst_id_pais) {
        this.inst_id_pais = inst_id_pais;
    }

    public int getInst_id_sector_servicio() {
        return inst_id_sector_servicio;
    }

    public void setInst_id_sector_servicio(int inst_id_sector_servicio) {
        this.inst_id_sector_servicio = inst_id_sector_servicio;
    }

    public String getInst_sector() {
        return inst_sector;
    }

    public void setInst_sector(String inst_sector) {
        this.inst_sector = inst_sector;
    }

    public InstitucionModel() {
    }

    public InstitucionModel(int inst_id_institucion, int inst_id_institucion_superior, int inst_id_domicilio, String inst_nombre, String inst_nivel, String inst_tipo, String inst_abreviatura, String inst_clave_unam, String inst_url_pagina, Boolean inst_afiliada_anfeca, String inst_ruta_logotipo, String inst_sistema, String inst_categoria_unam, char inst_tipo_afiliacion_afeca, int inst_id_institucion_sede, int inst_id_pais, int inst_id_sector_servicio, String inst_sector) {
        this.inst_id_institucion = inst_id_institucion;
        this.inst_id_institucion_superior = inst_id_institucion_superior;
        this.inst_id_domicilio = inst_id_domicilio;
        this.inst_nombre = inst_nombre;
        this.inst_nivel = inst_nivel;
        this.inst_tipo = inst_tipo;
        this.inst_abreviatura = inst_abreviatura;
        this.inst_clave_unam = inst_clave_unam;
        this.inst_url_pagina = inst_url_pagina;
        this.inst_afiliada_anfeca = inst_afiliada_anfeca;
        this.inst_ruta_logotipo = inst_ruta_logotipo;
        this.inst_sistema = inst_sistema;
        this.inst_categoria_unam = inst_categoria_unam;
        this.inst_tipo_afiliacion_afeca = inst_tipo_afiliacion_afeca;
        this.inst_id_institucion_sede = inst_id_institucion_sede;
        this.inst_id_pais = inst_id_pais;
        this.inst_id_sector_servicio = inst_id_sector_servicio;
        this.inst_sector = inst_sector;
    }
}
