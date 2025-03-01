package com.sksolutions.project.rubo.ruboApp.services.impl;

import com.sksolutions.project.rubo.ruboApp.dto.RideRequestDTO;
import com.sksolutions.project.rubo.ruboApp.entities.Driver;
import com.sksolutions.project.rubo.ruboApp.entities.Ride;
import com.sksolutions.project.rubo.ruboApp.entities.enums.RideStatus;
import com.sksolutions.project.rubo.ruboApp.services.RideService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class RideServiceImpl implements RideService {
    @Override
    public Ride getRideById(Long rideId) {
        return null;
    }

    @Override
    public void matchWithDrivers(RideRequestDTO rideRequestDTO) {

    }

    @Override
    public Ride createNewRide(RideRequestDTO rideRequestDTO, Driver driver) {
        return null;
    }

    @Override
    public Ride updateRideStatus(Long rideId, RideStatus rideStatus) {
        return null;
    }

    @Override
    public Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest) {
        return null;
    }

    @Override
    public Page<Ride> getAllRidesOfDriver(Long driverId, PageRequest pageRequest) {
        return null;
    }
}
