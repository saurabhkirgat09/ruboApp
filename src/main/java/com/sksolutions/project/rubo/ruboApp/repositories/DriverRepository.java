package com.sksolutions.project.rubo.ruboApp.repositories;

import com.sksolutions.project.rubo.ruboApp.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {
}
