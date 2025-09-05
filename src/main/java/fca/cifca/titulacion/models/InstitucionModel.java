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
    private Integer idInstitucion;

    @Column (name = "inst_id_institucion_superior", nullable = true)
    private Integer idInstitucionSuperior;

    @Column (name = "inst_id_domicilio", nullable = true)
    private Integer idDomicilio;

    @Column (name = "inst_nombre", nullable = false, length = 200)
    private String nombre;

    @Column (name = "inst_nivel", nullable = false, length = 1)
    private String nivel;

    @Column (name = "inst_tipo", nullable = false, length = 1)
    private String tipo;

    @Column (name = "inst_abreviatura", nullable = true, length = 20)
    private String abreviatura;

    @Column (name = "inst_clave_unam", nullable = true, length = 5)
    private String claveUnam;

    @Column (name = "inst_url_pagina", nullable = true, length = 50)
    private String urlPagina;

    @Column (name = "inst_afiliada_anfeca", nullable = true)
    private Boolean esAfiliadAnfeca;

    @Column (name = "inst_ruta_logotipo", nullable = true, length = 200)
    private  String rutaLogotipo;

    @Column (name = "inst_sistema", nullable = true, length = 10)
    private String sistema;

    @Column (name = "inst_categoria_unam", nullable = true, length = 15)
    private String categoriaUnam;

    @Column (name = "inst_tipo_afiliacion_anfeca", nullable = true)
    private String tipoAfiliacionAnfeca;

    @Column (name = "inst_id_institucion_sede", nullable = true)
    private Integer idInstitucionSede;

    @Column (name = "inst_id_pais", nullable = true)
    private Integer idPais;

    @Column (name = "inst_id_sector_servicio", nullable = true)
    private Integer idSectorServicio;

    @Column (name = "inst_sector", nullable = true, length = 10)
    private String sector;

}