package com.sksolutions.project.rubo.ruboApp.dto;

import com.sksolutions.project.rubo.ruboApp.entities.Driver;
import com.sksolutions.project.rubo.ruboApp.entities.Rider;
import com.sksolutions.project.rubo.ruboApp.entities.enums.PaymentMethod;
import com.sksolutions.project.rubo.ruboApp.entities.enums.RideRequestStatus;
import com.sksolutions.project.rubo.ruboApp.entities.enums.RideStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RideDTO {

    private Long id;
    private Point pickupLocation;
    private Point dropOffLocation;
    private LocalDateTime requestedTime;
    private RiderDTO rider;
    private DriverDTO driver;
    private PaymentMethod paymentMethod;
    private RideRequestStatus rideRequestStatus;
    private RideStatus rideStatus;
    private Double fare;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;
}
