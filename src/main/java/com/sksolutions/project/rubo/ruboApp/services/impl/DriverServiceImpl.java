package com.sksolutions.project.rubo.ruboApp.services.impl;

import com.sksolutions.project.rubo.ruboApp.dto.DriverDTO;
import com.sksolutions.project.rubo.ruboApp.dto.RideDTO;
import com.sksolutions.project.rubo.ruboApp.dto.RiderDTO;
import com.sksolutions.project.rubo.ruboApp.services.DriverService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverServiceImpl implements DriverService {
    @Override
    public RideDTO acceptRide(Long rideId) {
        return null;
    }

    @Override
    public RideDTO cancelRide(Long rideId) {
        return null;
    }

    @Override
    public RideDTO startRide(Long rideId) {
        return null;
    }

    @Override
    public RideDTO endRide(Long rideId) {
        return null;
    }

    @Override
    public RiderDTO rateRider(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public DriverDTO getMyProfile() {
        return null;
    }

    @Override
    public List<RideDTO> getAllMyRides() {
        return List.of();
    }
}
