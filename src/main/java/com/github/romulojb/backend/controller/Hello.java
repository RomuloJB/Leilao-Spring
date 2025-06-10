package com.github.romulojb.backend.controller;

import com.github.romulojb.backend.model.Calculadora;
import com.github.romulojb.backend.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Hello {
    @Autowired
    private HelloService helloService;
    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/somar")
    public Integer somar(@RequestParam("v1") Integer valor1,
                         @RequestParam("v2") Integer valor2) {
        return valor1 + valor2;
    }
    @PostMapping("/somar")
    public Calculadora somar(@RequestBody Calculadora calculadora) {
        calculadora.setResultado(calculadora.getValor1() + calculadora.getValor2());
        return helloService.somar(calculadora);
    }
}
