package com.projectmanager.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController extends AbstractRestController {

    @Override
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "Bem-vindo ao Projectr!");
        return "index/index";
    }
}
