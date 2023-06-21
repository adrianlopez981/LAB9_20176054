package com.example.lab9_20176054.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class ControllerBase {

    @GetMapping("/inicio")
    public String Inicio(Model model) {
        return "inicio";
    }



}
