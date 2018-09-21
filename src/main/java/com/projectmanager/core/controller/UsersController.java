package com.projectmanager.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UsersController extends AbstractRestController {

    @Override
    @GetMapping("/users")
    public String index(Model model) {
        // TODO: fetch a list of users from database
        return "user/index";
    }

    @Override
    @PostMapping("/user")
    public String create(Model model) {
        // TODO
        return "user/show";
    }

    @Override
    @GetMapping("/users/{id}")
    public String show(@PathVariable int id, Model model) {
        // TODO: fetch an user from database
        return "user/show";
    }

    @Override
    @GetMapping("/user/{id}")
    public String update(@PathVariable int id, Model model) {
        // TODO
        return "user/show";
    }

    @Override
    @GetMapping("/user/{id}")
    public String delete(@PathVariable int id, Model model) {
        // TODO
        return "user/index";
    }
}
