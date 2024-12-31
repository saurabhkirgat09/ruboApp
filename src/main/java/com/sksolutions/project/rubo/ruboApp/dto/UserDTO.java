package com.sksolutions.project.rubo.ruboApp.dto;

import com.sksolutions.project.rubo.ruboApp.entities.enums.Role;
import lombok.*;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private String name, email;
    private Set<Role> roles;
}
