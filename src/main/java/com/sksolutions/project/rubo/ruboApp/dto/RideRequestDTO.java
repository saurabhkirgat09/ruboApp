package com.sksolutions.project.rubo.ruboApp.dto;

import com.sksolutions.project.rubo.ruboApp.entities.Rider;
import com.sksolutions.project.rubo.ruboApp.entities.enums.PaymentMethod;
import com.sksolutions.project.rubo.ruboApp.entities.enums.RideRequestStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideRequestDTO {

    private Long id;
    private Point pickupLocation;
    private Point dropOffLocation;
    private LocalDateTime requestedTime;
    private RiderDTO rider;
    private PaymentMethod paymentMethod;
    private RideRequestStatus rideRequestStatus;

}
