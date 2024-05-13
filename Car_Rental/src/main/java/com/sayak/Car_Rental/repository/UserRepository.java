package com.sayak.Car_Rental.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sayak.Car_Rental.entity.User;
import com.sayak.Car_Rental.enums.UserRole;

import java.util.Optional;

@Repository

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User>findFirstByEmail(String email);

    User findByUserRole(UserRole userRole);
}