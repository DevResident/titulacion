package fca.cifca.titulacion.enums;

public enum Universidades {

    UNAM("Universidad Nacional Aut�noma de M�xico");

    private String nombre;

    Universidades(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

}
