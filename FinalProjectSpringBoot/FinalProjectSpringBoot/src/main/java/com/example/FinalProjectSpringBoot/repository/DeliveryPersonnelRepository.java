package com.example.FinalProjectSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FinalProjectSpringBoot.entity.DeliveryPersonnel;

public interface DeliveryPersonnelRepository extends JpaRepository<DeliveryPersonnel, Long> {

	<DeliveryPersonnel> DeliveryPersonnel saveAll(DeliveryPersonnel personnel);
    // Custom query methods, if needed
}

