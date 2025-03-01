package com.sksolutions.project.rubo.ruboApp.repositories;

import com.sksolutions.project.rubo.ruboApp.entities.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRepository extends JpaRepository<Ride, Long> {
}
