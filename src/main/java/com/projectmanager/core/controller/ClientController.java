package com.projectmanager.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
public class ClientController extends AbstractRestController {

    @Override
    @GetMapping("/clients")
    public String index(Model model) {
        return "client/index";
    }

    @Override
    @PostMapping("/client")
    public String create(Model model) {
        return "client/show";
    }

    @Override
    @GetMapping("/client/{id}")
    public String show(@PathVariable int id, Model model) {
        model.addAttribute("clientId", id);
        model.addAttribute("systemTitle", SYSTEM_TITLE);

        return "client/show";
    }

    @Override
    @GetMapping("/client/{id}/update")
    public String update(@PathVariable int id, Model model) {
        model.addAttribute("result", "Cliente " + id + " atualizado com sucesso!");
        return "client/show";
    }

    @Override
    @GetMapping("/client/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("result", "Cliente " + id + " apagado com sucesso!");
        return "client/index";
    }
}
