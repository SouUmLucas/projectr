package com.projectmanager.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController extends AbstractRestController {

    @Override
    @GetMapping("/")
    public String index() {
        return "index/index";
    }
}
