package fca.cifca.titulacion.models;

import jakarta.persistence.*;
import org.w3c.dom.Text;

@Entity
@Table (name = "domicilio")

public class DomicilioModel {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "domi_id_domicilio")
    private int idDomicilio;

    @Column(name = "domi_calle", nullable = false)
    private String calle;

    @Column(name = "domi_num_ext", nullable = true, length = 15)
    private String numeroExterior;

    @Column(name = "domi_num_int", nullable = true, length = 15)
    private String numeroInterior;

    @Column(name = "domi_tipo", nullable = true, length = 1)
    private String tipoDomicilio;

    @Column(name = "domi_id_codigo_postal", nullable = true)
    private int idCodigoPostal;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "domi_id_pais", nullable = true)
    private PaisModel pais;

    @Column(name = "domi_extranjero", nullable = true)
    private String esExtranjero;

    public int getIdDomicilio() {
        return idDomicilio;
    }

    public void setIdDomicilio(int idDomicilio) {
        this.idDomicilio = idDomicilio;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumeroExterior() {
        return numeroExterior;
    }

    public void setNumeroExterior(String numeroExterior) {
        this.numeroExterior = numeroExterior;
    }

    public String getNumeroInterior() {
        return numeroInterior;
    }

    public void setNumeroInterior(String numeroInterior) {
        this.numeroInterior = numeroInterior;
    }

    public String getTipoDomicilio() {
        return tipoDomicilio;
    }

    public void setTipoDomicilio(String tipoDomicilio) {
        this.tipoDomicilio = tipoDomicilio;
    }

    public int getIdCodigoPostal() {
        return idCodigoPostal;
    }

    public void setIdCodigoPostal(int idCodigoPostal) {
        this.idCodigoPostal = idCodigoPostal;
    }

    public PaisModel getPais() {
        return pais;
    }

    public void setPais(PaisModel pais) {
        this.pais = pais;
    }

    public String getEsExtranjero() {
        return esExtranjero;
    }

    public void setEsExtranjero(String esExtranjero) {
        this.esExtranjero = esExtranjero;
    }

    public DomicilioModel() {
    }

    public DomicilioModel(int idDomicilio, String calle, String numeroExterior, String numeroInterior, String tipoDomicilio, int idCodigoPostal, PaisModel pais, String esExtranjero) {
        this.idDomicilio = idDomicilio;
        this.calle = calle;
        this.numeroExterior = numeroExterior;
        this.numeroInterior = numeroInterior;
        this.tipoDomicilio = tipoDomicilio;
        this.idCodigoPostal = idCodigoPostal;
        this.pais = pais;
        this.esExtranjero = esExtranjero;
    }
}