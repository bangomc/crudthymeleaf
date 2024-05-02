package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/compras")
public class ComprasController {

    @GetMapping
    public String lst(ModelMap modelMap){
        return "/compra/lst";
    }

    @GetMapping("/novo")
    public String novo(ModelMap modelMap){
        return "/compra/add";
    }
}
