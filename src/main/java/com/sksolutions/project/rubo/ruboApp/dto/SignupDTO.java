package com.sksolutions.project.rubo.ruboApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignupDTO {

    private String name;
    private String email;
    private String password;

}
