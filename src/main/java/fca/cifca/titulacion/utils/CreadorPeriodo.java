package fca.cifca.titulacion.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
//Clase para crear el String del periodo.
public class CreadorPeriodo {

    private LocalDate fechaActual = LocalDate.now();
    int anio = fechaActual.getYear();
    int mes = fechaActual.getMonthValue();

    public String crearPeriodo(){

        //Julio a diciembre
        if(mes >= 7){

            return anio + "-1";

        } else {

            //Enero a junio
            return anio + "-2";
        }

    }

}
