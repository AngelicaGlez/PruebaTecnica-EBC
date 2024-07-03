package com.gonzalez.ebc.service;

import com.gonzalez.ebc.model.SecuenciaCollatz;

import java.util.List;

public interface IService {
    public String secuenciaCollatz(Integer numero);
    public Integer comparar(Integer numeroAux);
    public String secuenFizzBuzz(Integer numero);
    SecuenciaCollatz secuenciaColl(Integer numeroS);
}
