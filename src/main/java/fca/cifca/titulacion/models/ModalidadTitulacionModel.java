package fca.cifca.titulacion.models;

import jakarta.persistence.*;

@Entity
@Table (name = "modalidad_titulacion")

public class ModalidadTitulacionModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "moti_id_modalidad_titulacion")
    private int idModalidadTitulacion;

    @Column (name = "moti_nombre", nullable = false, length = 60)
    private String nombre;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "moti_id_coordinacion", nullable = true)
    private CoordinacionModel coor_id_coordinacion;

    @Column (name = "moti_estado", nullable = true, length = 1)
    private String estado;

    public int getIdModalidadTitulacion() {
        return idModalidadTitulacion;
    }

    public void setIdModalidadTitulacion(int idModalidadTitulacion) {
        this.idModalidadTitulacion = idModalidadTitulacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CoordinacionModel getCoor_id_coordinacion() {
        return coor_id_coordinacion;
    }

    public void setCoor_id_coordinacion(CoordinacionModel coor_id_coordinacion) {
        this.coor_id_coordinacion = coor_id_coordinacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ModalidadTitulacionModel() {
    }

    public ModalidadTitulacionModel(int idModalidadTitulacion, String nombre, CoordinacionModel coor_id_coordinacion, String estado) {
        this.idModalidadTitulacion = idModalidadTitulacion;
        this.nombre = nombre;
        this.coor_id_coordinacion = coor_id_coordinacion;
        this.estado = estado;
    }
}
