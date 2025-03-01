package com.sksolutions.project.rubo.ruboApp.services.impl;

import com.sksolutions.project.rubo.ruboApp.dto.DriverDTO;
import com.sksolutions.project.rubo.ruboApp.dto.SignupDTO;
import com.sksolutions.project.rubo.ruboApp.dto.UserDTO;
import com.sksolutions.project.rubo.ruboApp.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDTO signup(SignupDTO signupDTO) {
        return null;
    }

    @Override
    public DriverDTO onboardNewDriver(Long userId) {
        return null;
    }
}
