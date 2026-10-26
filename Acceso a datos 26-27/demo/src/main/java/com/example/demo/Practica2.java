package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Practica2 {

    @GetMapping("/contacto")
    public String contacto(Model model) {
        model.addAttribute("mensaje", "hola desde spring mvc");
        return "contacto";
    }
}