package com.example.FinalProjectSpringBoot.service;

import java.util.List;

import com.example.FinalProjectSpringBoot.entity.DeliveryPersonnel;

public interface DeliveryPersonnelService {

	List<DeliveryPersonnel> getAllDeliveryPersonnel();

	DeliveryPersonnel getDeliveryPersonnelById(Long personnelId);

	DeliveryPersonnel saveDeliveryPersonnel(DeliveryPersonnel personnel);

	void deleteDeliveryPersonnel(Long personnelId);

}
