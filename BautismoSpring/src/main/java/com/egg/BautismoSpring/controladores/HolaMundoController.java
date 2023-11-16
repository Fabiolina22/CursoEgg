package com.egg.BautismoSpring.controladores;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HolaMundoController {

    @GetMapping("/saludo/{usuario}")
    public String saludo(@PathVariable String usuario){

        return "Hola Mundo Spring Boot" + usuario;

    }

    @GetMapping("/lista")
    public List lista(){

        return List.of("fran ","Dorys ", "Laureano" );
    }

    @GetMapping("sumar/{numeroA}/{numeroB}")
    public int suma(@PathVariable int numeroA, @PathVariable int numeroB){
        int total = numeroA + numeroB;
        return total;
    }

}
