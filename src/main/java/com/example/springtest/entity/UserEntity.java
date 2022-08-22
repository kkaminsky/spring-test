package com.example.springtest.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldNameConstants;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "user")
@FieldNameConstants
@Getter
@Setter
@NoArgsConstructor
@ToString
public class UserEntity {

    @Id
    private UUID id = UUID.randomUUID();

    private String login;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_to_list",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "list_id"))
    private List<ListEntity> lists;
}
