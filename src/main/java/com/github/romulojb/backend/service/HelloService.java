package com.github.romulojb.backend.service;

import com.github.romulojb.backend.model.Calculadora;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class HelloService {
    public Calculadora somar(@RequestBody Calculadora calculadora) {
        calculadora.setResultado(calculadora.getValor1() + calculadora.getValor2());
        return calculadora;
    }
}
