//package com.example.FinalProjectSpringBoot.controller;
//
//import java.util.List;
//
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.FinalProjectSpringBoot.entity.DeliveryPersonnel;
//import com.example.FinalProjectSpringBoot.service.DeliveryPersonnelServiceImpl;
//
//@RestController
//@RequestMapping("/delivery-personnel")
//public class DeliveryPersonnelController {
//    private final DeliveryPersonnelServiceImpl personnelService;
//
//    public DeliveryPersonnelController(DeliveryPersonnelServiceImpl personnelService) {
//        this.personnelService = personnelService;
//    }
//
//    @GetMapping
//    public List<DeliveryPersonnel> getAllDeliveryPersonnel() {
//        return personnelService.getAllDeliveryPersonnel();
//    }
//
//    @GetMapping("/{personnelId}")
//    public DeliveryPersonnel getDeliveryPersonnelById(@PathVariable Long personnelId) {
//        return personnelService.getDeliveryPersonnelById(personnelId);
//    }
//
//    @PostMapping
//    public DeliveryPersonnel saveDeliveryPersonnel(@RequestBody DeliveryPersonnel personnel) {
//        return personnelService.saveDeliveryPersonnel(personnel);
//    }
//
//    @DeleteMapping("/{personnelId}")
//    public void deleteDeliveryPersonnel(@PathVariable Long personnelId) {
//        personnelService.deleteDeliveryPersonnel(personnelId);
//    }
//}


package com.example.FinalProjectSpringBoot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FinalProjectSpringBoot.entity.DeliveryPersonnel;
import com.example.FinalProjectSpringBoot.service.DeliveryPersonnelService;

@RestController
@RequestMapping("/delivery-personnel")
public class DeliveryPersonnelController {
    private final DeliveryPersonnelService personnelService;

    public DeliveryPersonnelController(DeliveryPersonnelService personnelService) {
        this.personnelService = personnelService;
    }

    @GetMapping
    public List<DeliveryPersonnel> getAllDeliveryPersonnel() {
        return personnelService.getAllDeliveryPersonnel();
    }

    @GetMapping("/{personnelId}")
    public DeliveryPersonnel getDeliveryPersonnelById(@PathVariable Long personnelId) {
        return personnelService.getDeliveryPersonnelById(personnelId);
    }

    @PostMapping
    public DeliveryPersonnel saveDeliveryPersonnel(@RequestBody DeliveryPersonnel personnel) {
        return personnelService.saveDeliveryPersonnel(personnel);
    }

    @DeleteMapping("/{personnelId}")
    public void deleteDeliveryPersonnel(@PathVariable Long personnelId) {
        personnelService.deleteDeliveryPersonnel(personnelId);
    }
}
