package com.sksolutions.project.rubo.ruboApp.services;

import com.sksolutions.project.rubo.ruboApp.dto.RideRequestDTO;
import com.sksolutions.project.rubo.ruboApp.entities.Driver;
import com.sksolutions.project.rubo.ruboApp.entities.Ride;
import com.sksolutions.project.rubo.ruboApp.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService {

    Ride getRideById(Long rideId);

    void matchWithDrivers(RideRequestDTO rideRequestDTO);

    Ride createNewRide(RideRequestDTO rideRequestDTO, Driver driver);

    Ride updateRideStatus(Long rideId, RideStatus rideStatus);

    Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest);

    Page<Ride> getAllRidesOfDriver(Long driverId, PageRequest pageRequest);
}
