package edu.elp.siselp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("index")
public class saludo {
    @GetMapping("/saludo")
    public String saludo(@RequestParam String nombre){
        return "Hola mundo desde Ayacucho!!....Te saluda "  +  nombre;
    }
    @GetMapping("/bienvenida")
    public String bienvenida(){
        return "Hola amig@s del curso de Java!!";
    }
}
