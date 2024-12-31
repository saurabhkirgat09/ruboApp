package com.sksolutions.project.rubo.ruboApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DriverDTO {

    private UserDTO user;
    private Double rating;
}
