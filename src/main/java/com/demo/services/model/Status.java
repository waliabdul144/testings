package com.demo.services.model;

public class Status {

    private boolean logged_in;
    private String token;

    public boolean isLogged_in() {
        return logged_in;
    }

    public void setLogged_in(boolean logged_in) {
        this.logged_in = logged_in;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Status(boolean logged_in, String token) {
        this.logged_in = logged_in;
        this.token = token;
    }

    public Status() {
    }
}
