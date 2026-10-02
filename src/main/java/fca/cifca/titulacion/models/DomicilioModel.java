package fca.cifca.titulacion.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.w3c.dom.Text;

@Entity
@Table (name = "domicilio")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DomicilioModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "domi_id_domicilio")
    private Integer idDomicilio;

    @Column(name = "domi_calle", nullable = false)
    private String calle;

    @Column(name = "domi_num_ext", nullable = true, length = 15)
    private String numeroExterior;

    @Column(name = "domi_num_int", nullable = true, length = 15)
    private String numeroInterior;

    @Column(name = "domi_tipo", nullable = true, length = 1)
    private String tipoDomicilio;

    @Column(name = "domi_id_codigo_postal", nullable = true)
    private Integer idCodigoPostal;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "domi_id_pais", nullable = true)
    private PaisModel pais;

    @Column(name = "domi_extranjero", nullable = true)
    private String esExtranjero;

}