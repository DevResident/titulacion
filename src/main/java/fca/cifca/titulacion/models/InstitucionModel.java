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

}
