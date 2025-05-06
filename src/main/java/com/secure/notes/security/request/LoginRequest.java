package com.secure.notes.security.request;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Setter
@Getter
public class LoginRequest {
    private String username;

    private String password;

}


