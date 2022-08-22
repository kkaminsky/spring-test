package com.example.springtest.domain.model;

import lombok.Data;

import java.util.UUID;

@Data
public class UserDto {
    private UUID id;
    private String login;
}
