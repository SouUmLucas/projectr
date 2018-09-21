package com.projectmanager.core.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;

public interface RestController {
    public String index(Model model);
    public String create(Model model);
    public String show(@PathVariable int id, Model model);
    public String update(@PathVariable int id, Model model);
    public String delete(@PathVariable int id, Model model);
}
