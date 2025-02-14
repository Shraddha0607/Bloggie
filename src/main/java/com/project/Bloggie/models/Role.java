package com.project.Bloggie.models;

import com.project.Bloggie.Enum.RoleName;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roleId;

    @Enumerated(EnumType.STRING)
    private RoleName roleDesc;

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
    private List<UserDetails> userList = new ArrayList<>();
}
