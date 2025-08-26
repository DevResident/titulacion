package fca.cifca.titulacion.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "institucion")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InstitucionModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "inst_id_institucion")
    private int inst_id_institucion;

    @Column (name = "inst_id_institucion_superior", nullable = true)
    private int inst_id_institucion_superior;

    @Column (name = "inst_id_domicilio", nullable = true)
    private int inst_id_domicilio;

    @Column (name = "inst_nombre", nullable = false, length = 200)
    private String inst_nombre;

    @Column (name = "inst_nivel", nullable = false, length = 1)
    private String inst_nivel;

    @Column (name = "inst_tipo", nullable = false, length = 1)
    private String inst_tipo;

    @Column (name = "inst_abreviatura", nullable = true, length = 20)
    private String inst_abreviatura;

    @Column (name = "inst_clave_unam", nullable = true, length = 5)
    private String inst_clave_unam;

    @Column (name = "inst_url_pagina", nullable = true, length = 50)
    private String inst_url_pagina;

    @Column (name = "inst_afiliada_anfeca", nullable = true)
    private Boolean inst_afiliada_anfeca;

    @Column (name = "inst_ruta_logotipo", nullable = true, length = 200)
    private  String inst_ruta_logotipo;

    @Column (name = "inst_sistema", nullable = true, length = 10)
    private String inst_sistema;

    @Column (name = "inst_categoria_unam", nullable = true, length = 15)
    private String inst_categoria_unam;

    @Column (name = "inst_tipo_afiliacion_anfeca", nullable = true)
    private char inst_tipo_afiliacion_afeca;

    @Column (name = "inst_id_institucion_sede", nullable = true)
    private int inst_id_institucion_sede;

    @Column (name = "inst_id_pais", nullable = true)
    private int inst_id_pais;

    @Column (name = "inst_id_sector_servicio", nullable = true)
    private int inst_id_sector_servicio;

    @Column (name = "inst_sector", nullable = true, length = 10)
    private String inst_sector;

}