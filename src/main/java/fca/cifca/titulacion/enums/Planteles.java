package fca.cifca.titulacion.enums;

public enum Planteles {

    FCA("Facultad de Contadur�a y Administraci�n");
    private String nombre;

    private Planteles(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

}
