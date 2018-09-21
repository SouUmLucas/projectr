package com.projectmanager.core.controller;

import org.springframework.ui.Model;

public class AbstractRestController implements RestController {
    protected String SYSTEM_TITLE = "Projectr";

    @Override
    public String index(Model model) {
        return null;
    }

    @Override
    public String create(Model model) {
        return null;
    }

    @Override
    public String show(int id, Model model) {
        return null;
    }

    @Override
    public String update(int id, Model model) {
        return null;
    }

    @Override
    public String delete(int id, Model model) {
		return null;
	}

}
