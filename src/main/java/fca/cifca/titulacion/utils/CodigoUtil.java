package fca.cifca.titulacion.utils;

import java.security.SecureRandom;

public class CodigoUtil {

    private static final SecureRandom random = new SecureRandom();

    public static String generarCodigo() {
        int numero = 100000 + random.nextInt(900000); //6 digitos
        return String.valueOf(numero);
    }

}
