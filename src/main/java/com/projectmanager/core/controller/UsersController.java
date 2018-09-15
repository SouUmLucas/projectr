package com.projectmanager.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class UsersController extends AbstractRestController {

    @GetMapping("/users")
    public String index() {
        // TODO: fetch a list of users from database
        return "user/index";
    }

    @Override
    @GetMapping("/users/{id}")
    public String show() {
        // TODO: fetch an user from database
        return "user/show";
    }

    @Override
    @PostMapping("/user")
    public String create() {
        // TODO
        return "user/show";
    }

    @Override
    @PutMapping("/user/{id}")
    public String update() {
        // TODO
        return "user/show";
    }

    @Override
    @DeleteMapping("/user/{id}")
    public String delete() {
        // TODO
        return "user/index";
    }
}
