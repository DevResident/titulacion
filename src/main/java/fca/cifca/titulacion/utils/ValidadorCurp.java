package fca.cifca.titulacion.utils;

import java.util.regex.Pattern;

public class ValidadorCurp {

    //Regex para la CURP.
    private static final String PATRON_CURP =
            "^[A-Z]{4}\\d{6}[HM][A-Z]{2}[A-Z]{3}[A-Z0-9]{2}$";

    private final Pattern patron;

    //Compilar el patrón una sola vez mediante el constructor.
    public ValidadorCurp() {
        this.patron = Pattern.compile(PATRON_CURP);
    }

    //Método de validación lógica.
    public boolean validar(String curp) {
        if (curp != null) {

            return patron.matcher(curp).matches();

        }

        return false;

    }

}