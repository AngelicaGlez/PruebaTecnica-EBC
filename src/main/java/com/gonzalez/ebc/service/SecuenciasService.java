package com.gonzalez.ebc.service;

import com.gonzalez.ebc.model.SecuenciaCollatz;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Qualifier("servicio")
public class SecuenciasService implements IService {
    @Override
    public String secuenciaCollatz(Integer numero){
        StringBuilder secuencia= new StringBuilder();
        secuencia.append(String.valueOf(numero));
        while (numero!=1){
            numero= this.comparar(numero);
            secuencia.append(" ");
            secuencia.append(String.valueOf(numero));
        }
        return secuencia.toString();
    }
    @Override
    public Integer comparar(Integer numeroAux){
        if (numeroAux%2==0){
            return numeroAux/2;
        }
        else {
            return (numeroAux*3)+1;
        }
    }

    @Override
    public String secuenFizzBuzz(Integer numero) {
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
    public SecuenciaCollatz secuenciaColl(Integer numeroS) {
        SecuenciaCollatz sCollatz = new SecuenciaCollatz();
        List<Integer> collatz = new ArrayList<>();
        collatz.add(numeroS);
        while (numeroS!=1){
            numeroS= this.comparar(numeroS);
            collatz.add(numeroS);
        }
        sCollatz.setSecuencia(collatz);
        sCollatz.setMensaje("Proceso finalizado");
        return sCollatz;
    }


}
