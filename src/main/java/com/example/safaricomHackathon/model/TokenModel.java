package com.example.safaricomHackathon.model;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class TokenModel {

    private String token;

    public TokenModel(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
