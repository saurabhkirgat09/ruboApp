package com.sksolutions.project.rubo.ruboApp.services;

import com.sksolutions.project.rubo.ruboApp.dto.DriverDTO;
import com.sksolutions.project.rubo.ruboApp.dto.RideDTO;
import com.sksolutions.project.rubo.ruboApp.dto.RiderDTO;

import java.util.List;

public interface DriverService {

    RideDTO acceptRide(Long rideId);

    RideDTO cancelRide(Long rideId);

    RideDTO startRide(Long rideId);

    RideDTO endRide(Long rideId);

    RiderDTO rateRider(Long rideId, Integer rating);

    DriverDTO getMyProfile();

    List<RideDTO> getAllMyRides();
}
