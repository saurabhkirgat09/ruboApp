package com.sksolutions.project.rubo.ruboApp.repositories;

import com.sksolutions.project.rubo.ruboApp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
