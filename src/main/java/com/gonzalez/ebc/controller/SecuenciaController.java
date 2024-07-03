package com.gonzalez.ebc.controller;

import com.gonzalez.ebc.service.SecuenciasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/secuencias")
@CrossOrigin(origins = "*")
public class SecuenciaController {
    @Autowired
    @Qualifier("servicio")
    SecuenciasService servicio;
    @GetMapping("/collatz/{numero}")
    public String secuenciaCo(@PathVariable(name = "numero") Integer numero){
        return servicio.secuenciaCollatz(numero);
    }

    @GetMapping("/fizz/{numero}")
    public String secuenciaFizz(@PathVariable(name = "numero") Integer numero){
        return servicio.secuenciaAuxFizz(numero);
    }
}
