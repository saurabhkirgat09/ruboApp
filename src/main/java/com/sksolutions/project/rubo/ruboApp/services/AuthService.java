package com.sksolutions.project.rubo.ruboApp.services;

import com.sksolutions.project.rubo.ruboApp.dto.DriverDTO;
import com.sksolutions.project.rubo.ruboApp.dto.SignupDTO;
import com.sksolutions.project.rubo.ruboApp.dto.UserDTO;

public interface AuthService {

    String login(String email, String password);

    UserDTO signup(SignupDTO signupDTO);

    DriverDTO onboardNewDriver(Long userId);
}
