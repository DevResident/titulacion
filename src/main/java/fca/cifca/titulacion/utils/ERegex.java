package fca.cifca.titulacion.utils;

public enum ERegex {

    CURP("^[A-Z]{4}\\d{6}[HM][A-Z]{2}[A-Z]{3}(?:[A-Z]\\d|\\d\\d)$"),
    NUMERO_CUENTA("^\\d{9}$");

    private final String patron;

    ERegex(String patron) {
        this.patron = patron;
    }

    public String getPatron() {
        return patron;
    }

}