package com.gonzalez.ebc.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("servicio")
public class SecuenciasService implements IService {
    @Override
    public String secuenciaCollatz(Integer numero){
        StringBuilder secuencia= new StringBuilder();
        secuencia.append(String.valueOf(numero));
        while (numero!=1){
            numero=compararPares(numero);
            secuencia.append(" ");
            secuencia.append(String.valueOf(numero));
        }
        return secuencia.toString();
    }
    @Override
    public Integer compararPares(Integer numeroAux){
        if (numeroAux%2==0){
            return numeroAux/2;
        }
        else {
            return (numeroAux*3)+1;
        }
    }

    @Override
    public String secuenFizzBuzz(Integer numero) {
        String respuesta;
            if (numero % 3 == 0 && numero % 5 == 0) {
                return "FizzBuzz";
            } else {
                if (numero % 3 == 0) {
                    return "Fizz";
                }
                if (numero % 5 == 0) {
                    return "Buzz";
                }
                return "Sin coincidencias";
            }
        }


    @Override
    public String secuenciaAuxFizz(Integer numero) {
        StringBuilder aux= new StringBuilder();
        for (int numeroF=1; numeroF<=20; numeroF++ ) {
            aux.append(secuenFizzBuzz(numeroF));
            aux.append("\n");
        }
    return aux.toString();
    }
}
