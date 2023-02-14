package com.condingdojo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi/")
public class DaikichiControllerRest {

    @GetMapping("/travel/{ciudad}")
    public String ciudad(@PathVariable String ciudad) {
        return String.format("¡Felicitaciones! ¡Pronto viajarás a %s", ciudad);
    }

    @GetMapping("/lotto/{numero}")
    public String mensajeNumero(@PathVariable int numero) {
        if (numero % 2 == 0) {
            return "Harás un gran viaje en un futuro cercano, pero ten cuidado con las ofertas tentadoras.";
        }
        return "Has disfrutado de los frutos de tu trabajo, pero ahora es un buen momento para pasar tiempo con familiares y amigos";
    }
}
