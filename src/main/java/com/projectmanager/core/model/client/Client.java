package com.projectmanager.core.model.client;

import com.projectmanager.core.model.Entity;

public class Client extends Entity {
    private String name;
    private String social_name;
    private String cnpj;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocial_name() {
        return social_name;
    }

    public void setSocial_name(String social_name) {
        this.social_name = social_name;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
