package com.sksolutions.project.rubo.ruboApp.dto;

import com.sksolutions.project.rubo.ruboApp.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RiderDTO {

    private UserDTO user;
    private Double rating;
}
