package com.example.FinalProjectSpringBoot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.FinalProjectSpringBoot.entity.DeliveryStatus;
import com.example.FinalProjectSpringBoot.repository.DeliveryStatusRepository;

@Service
public class DeliveryStatusServiceImpl {
    private final DeliveryStatusRepository statusRepository;

    public DeliveryStatusServiceImpl(DeliveryStatusRepository statusRepository) {
        this.statusRepository = statusRepository;
    }

    public List<DeliveryStatus> getAllDeliveryStatuses() {
        return statusRepository.findAll();
    }

    public DeliveryStatus getDeliveryStatusById(Long statusId) {
        return statusRepository.findById(statusId).orElse(null);
    }

    public DeliveryStatus saveDeliveryStatus(DeliveryStatus status) {
        return statusRepository.save(status);
    }

    public void deleteDeliveryStatus(Long statusId) {
        statusRepository.deleteById(statusId);
    }
}
