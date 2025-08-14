package fca.cifca.titulacion.models;

import jakarta.persistence.*;
import org.w3c.dom.Text;

@Entity
@Table (name = "domicilio")

public class DomicilioModel {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "domi_id_domicilio")
    private int domicilio_id_domicilio;

    @Column(name = "domi_calle", nullable = false)
    private String domicilio_calle;

    @Column(name = "domi_num_ext", nullable = true, length = 15)
    private String domicilio_num_ext;

    @Column(name = "domi_num_int", nullable = true, length = 15)
    private String domicilio_num_int;

    @Column(name = "domi_tipo", nullable = true, length = 1)
    private String domicilio_tipo;

    @Column(name = "domi_id_codigo_postal", nullable = true)
    private int domicilio_id_codigo_postal;

    @Column(name = "domi_id_pais", nullable = true)
    private int domicilio_id_pais;

    @Column(name = "domi_extranjero", nullable = true)
    private String domicilio_extranjero;

    public int getDomicilio_id_domicilio() {
        return domicilio_id_domicilio;
    }

    public void setDomicilio_id_domicilio(int domicilio_id_domicilio) {
        this.domicilio_id_domicilio = domicilio_id_domicilio;
    }

    public String getDomicilio_calle() {
        return domicilio_calle;
    }

    public void setDomicilio_calle(String domicilio_calle) {
        this.domicilio_calle = domicilio_calle;
    }

    public String getDomicilio_num_ext() {
        return domicilio_num_ext;
    }

    public void setDomicilio_num_ext(String domicilio_num_ext) {
        this.domicilio_num_ext = domicilio_num_ext;
    }

    public String getDomicilio_num_int() {
        return domicilio_num_int;
    }

    public void setDomicilio_num_int(String domicilio_num_int) {
        this.domicilio_num_int = domicilio_num_int;
    }

    public String getDomicilio_tipo() {
        return domicilio_tipo;
    }

    public void setDomicilio_tipo(String domicilio_tipo) {
        this.domicilio_tipo = domicilio_tipo;
    }

    public int getDomicilio_id_codigo_postal() {
        return domicilio_id_codigo_postal;
    }

    public void setDomicilio_id_codigo_postal(int domicilio_id_codigo_postal) {
        this.domicilio_id_codigo_postal = domicilio_id_codigo_postal;
    }

    public int getDomicilio_id_pais() {
        return domicilio_id_pais;
    }

    public void setDomicilio_id_pais(int domicilio_id_pais) {
        this.domicilio_id_pais = domicilio_id_pais;
    }

    public String getDomicilio_extranjero() {
        return domicilio_extranjero;
    }

    public void setDomicilio_extranjero(String domicilio_extranjero) {
        this.domicilio_extranjero = domicilio_extranjero;
    }

    public DomicilioModel() {
    }

    public DomicilioModel(int domicilio_id_domicilio, String domicilio_calle, String domicilio_num_ext, String domicilio_num_int, String domicilio_tipo, int domicilio_id_codigo_postal, int domicilio_id_pais, String domicilio_extranjero) {
        this.domicilio_id_domicilio = domicilio_id_domicilio;
        this.domicilio_calle = domicilio_calle;
        this.domicilio_num_ext = domicilio_num_ext;
        this.domicilio_num_int = domicilio_num_int;
        this.domicilio_tipo = domicilio_tipo;
        this.domicilio_id_codigo_postal = domicilio_id_codigo_postal;
        this.domicilio_id_pais = domicilio_id_pais;
        this.domicilio_extranjero = domicilio_extranjero;
    }
}