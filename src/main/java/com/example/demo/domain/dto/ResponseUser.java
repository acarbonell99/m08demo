package com.example.demo.domain.dto;

import java.util.UUID;

public class ResponseUser {
    public UUID userid;
    public String username;

    public ResponseUser(UUID userid, String username) {
        this.userid = userid;
        this.username = username;
    }
}
