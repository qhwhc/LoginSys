package com.ccc.loginsys.dto;

import java.util.List;

public class User {
    private String id;

    private String usercode;

    private String username;

    private String password;

    private String salt;

    private String locked;

    private List<Role> roles;

    public List<Role> getRoles() {
        return roles;
    }

    public User setRoles(List<Role> roles) {
        this.roles = roles;
        return this;
    }

    public String getId() {
        return id;
    }

    public User setId(String id) {
        this.id = id == null ? null : id.trim();
        return this;
    }

    public String getUsercode() {
        return usercode;
    }

    public User setUsercode(String usercode) {
        this.usercode = usercode == null ? null : usercode.trim();
        return this;
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username == null ? null : username.trim();
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password == null ? null : password.trim();
        return this;
    }

    public String getSalt() {
        return salt;
    }

    public User setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
        return this;
    }

    public String getLocked() {
        return locked;
    }

    public User setLocked(String locked) {
        this.locked = locked == null ? null : locked.trim();
        return this;
    }
}