package com.ccc.loginsys.dto;

import java.util.List;

public class Role {
    private String id;

    private String name;

    private String available;

    private List<Permission> permissons;

    public List<Permission> getPermissons() {
        return permissons;
    }

    public Role setPermissons(List<Permission> permissons) {
        this.permissons = permissons;
        return this;
    }

    public String getId() {
        return id;
    }

    public Role setId(String id) {
        this.id = id == null ? null : id.trim();
        return this;
    }

    public String getName() {
        return name;
    }

    public Role setName(String name) {
        this.name = name == null ? null : name.trim();
        return this;
    }

    public String getAvailable() {
        return available;
    }

    public Role setAvailable(String available) {
        this.available = available == null ? null : available.trim();
        return this;
    }
}