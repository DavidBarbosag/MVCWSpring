package com.eci.ARSW.mvcSpring.mvcSpring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormularioController {

    @GetMapping("/formulario")
    public String formulario() {
        return "formulario";
    }

    @PostMapping("/formulario")
    public String procesarFormulario(@RequestParam("nombre") String nombre, Model model) {
        model.addAttribute("name", nombre);
        return "greeting";
    }

}

