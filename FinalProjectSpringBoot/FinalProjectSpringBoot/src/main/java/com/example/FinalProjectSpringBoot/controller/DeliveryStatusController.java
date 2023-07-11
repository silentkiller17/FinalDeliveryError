package com.example.FinalProjectSpringBoot.controller;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FinalProjectSpringBoot.entity.DeliveryStatus;
import com.example.FinalProjectSpringBoot.service.DeliveryStatusServiceImpl;

@RestController
@RequestMapping("/delivery-status")
public class DeliveryStatusController {
    private final DeliveryStatusServiceImpl statusService;

    public DeliveryStatusController(DeliveryStatusServiceImpl statusService) {
        this.statusService = statusService;
    }

    @GetMapping
    public List<DeliveryStatus> getAllDeliveryStatuses() {
        return statusService.getAllDeliveryStatuses();
    }

    @GetMapping("/{statusId}")
    public DeliveryStatus getDeliveryStatusById(@PathVariable Long statusId) {
        return statusService.getDeliveryStatusById(statusId);
    }

    @PostMapping
    public DeliveryStatus saveDeliveryStatus(@RequestBody DeliveryStatus status) {
        return statusService.saveDeliveryStatus(status);
    }

    @DeleteMapping("/{statusId}")
    public void deleteDeliveryStatus(@PathVariable Long statusId) {
        statusService.deleteDeliveryStatus(statusId);
    }
}
