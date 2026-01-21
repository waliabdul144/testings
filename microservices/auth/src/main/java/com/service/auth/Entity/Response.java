package com.service.auth.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Response {
    private String jwt;
    private String id;

    public Response(String jwt, String id) {
        this.jwt = jwt;
        this.id = id;
    }

    public Response() {
    }
}