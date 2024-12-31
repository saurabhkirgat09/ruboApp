package com.sksolutions.project.rubo.ruboApp.services;

import com.sksolutions.project.rubo.ruboApp.dto.DriverDTO;
import com.sksolutions.project.rubo.ruboApp.dto.RideDTO;
import com.sksolutions.project.rubo.ruboApp.dto.RideRequestDTO;
import com.sksolutions.project.rubo.ruboApp.dto.RiderDTO;

import java.util.List;

public interface RiderService {

    RideRequestDTO requestRide(Long rideId);

    RideDTO cancelRide(Long rideId);

    DriverDTO rateDriver(Long rideId, Integer rating);

    RiderDTO getMyProfile();

    List<RideDTO> getAllMyRides();
}
