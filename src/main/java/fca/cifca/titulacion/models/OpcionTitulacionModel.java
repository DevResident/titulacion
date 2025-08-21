package fca.cifca.titulacion.models;

import jakarta.persistence.*;

@Entity
@Table (name = "opcion_titulacion")

public class OpcionTitulacionModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "opti_id_opcion_titulacion")
    private int idOpcionTitulacion;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn (name = "opti_id_area_conocimiento", nullable = true)
    private AreaConocimientoModel areaConocimiento;

    @Column (name = "opti_nombre", nullable = false, length = 250)
    private String nombre;

    @Column (name = "opti_num_modulo", nullable = true)
    private int numModulo;

    @Column (name = "opti_siglas", nullable = true, length = 10)
    private String siglas;

    @Column (name = "opti_clave", nullable = true, length = 5)
    private String clave;

    @Column (name = "opti_estado", nullable = true)
    private String estado;

    @Column (name = "opti_idioma", nullable = true, length = 15)
    private String idioma;

    public int getIdOpcionTitulacion() {
        return idOpcionTitulacion;
    }

    public void setIdOpcionTitulacion(int idOpcionTitulacion) {
        this.idOpcionTitulacion = idOpcionTitulacion;
    }

    public AreaConocimientoModel getAreaConocimiento() {
        return areaConocimiento;
    }

    public void setAreaConocimiento(AreaConocimientoModel areaConocimiento) {
        this.areaConocimiento = areaConocimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumModulo() {
        return numModulo;
    }

    public void setNumModulo(int numModulo) {
        this.numModulo = numModulo;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public OpcionTitulacionModel() {
    }

    public OpcionTitulacionModel(int idOpcionTitulacion, AreaConocimientoModel areaConocimiento, String nombre, int numModulo, String siglas, String clave, String estado, String idioma) {
        this.idOpcionTitulacion = idOpcionTitulacion;
        this.areaConocimiento = areaConocimiento;
        this.nombre = nombre;
        this.numModulo = numModulo;
        this.siglas = siglas;
        this.clave = clave;
        this.estado = estado;
        this.idioma = idioma;
    }
}
