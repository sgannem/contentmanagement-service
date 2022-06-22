package com.sample.contentmanagement.model;

import lombok.Data;
import lombok.ToString;

import java.util.Set;

@Data
@ToString
public class SignupRequest {
    private String username;
    private String email;
    private String password;
    private Set<String> role;
}
