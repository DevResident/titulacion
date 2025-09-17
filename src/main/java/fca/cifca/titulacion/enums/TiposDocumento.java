package fca.cifca.titulacion.enums;

public enum TiposDocumento {
    FOTO("foto"),
    COMPROBANTE_IDIOMA("ingles"),
    SERVICIO_SOCIAL("servicio_social"),
    PUNTOS_CULTURALES("puntos_culturales"),
    HISTORIA_ACADEMICA("historia_academica"),
    CERTIFICADO_SECUNDARIA("certificado_secundaria");

    private final String descripcion;

    TiposDocumento(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}