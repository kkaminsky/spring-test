package com.example.springtest.domain.model;

import lombok.Data;

import java.util.Set;
import java.util.UUID;

@Data
public class DetailedListDto {
    private String name;
    private Set<UserDto> users;
}
