package com.example.FinalProjectSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FinalProjectSpringBoot.entity.DeliveryStatus;

public interface DeliveryStatusRepository extends JpaRepository<DeliveryStatus, Long> {
    // Custom query methods, if needed
}
