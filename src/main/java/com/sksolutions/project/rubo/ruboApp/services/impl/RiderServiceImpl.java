package com.sksolutions.project.rubo.ruboApp.services.impl;

import com.sksolutions.project.rubo.ruboApp.dto.DriverDTO;
import com.sksolutions.project.rubo.ruboApp.dto.RideDTO;
import com.sksolutions.project.rubo.ruboApp.dto.RideRequestDTO;
import com.sksolutions.project.rubo.ruboApp.dto.RiderDTO;
import com.sksolutions.project.rubo.ruboApp.services.RiderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiderServiceImpl implements RiderService {
    @Override
    public RideRequestDTO requestRide(Long rideId) {
        return null;
    }

    @Override
    public RideDTO cancelRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDTO rateDriver(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public RiderDTO getMyProfile() {
        return null;
    }

    @Override
    public List<RideDTO> getAllMyRides() {
        return List.of();
    }
}
