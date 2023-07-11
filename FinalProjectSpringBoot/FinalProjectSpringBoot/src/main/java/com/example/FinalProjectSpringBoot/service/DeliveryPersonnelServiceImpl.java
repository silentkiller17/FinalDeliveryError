//package com.example.FinalProjectSpringBoot.service;
//
//import java.util.List;
//
//import org.springframework.stereotype.Service;
//
//import com.example.FinalProjectSpringBoot.repository.DeliveryPersonnelRepository;
//
//@Service
//public class DeliveryPersonnelServiceImpl<DeliveryPersonnel> {
//    private DeliveryPersonnelRepository personnelRepository;
//
//    public void DeliveryPersonnelService(DeliveryPersonnelRepository personnelRepository) {
//        this.personnelRepository = personnelRepository;
//    }
//
//    @SuppressWarnings("unchecked")
//	public List<DeliveryPersonnel> getAllDeliveryPersonnel() {
//        return (List<DeliveryPersonnel>) personnelRepository.findAll();
//    }
//
//    @SuppressWarnings("unchecked")
//	public DeliveryPersonnel getDeliveryPersonnelById(Long personnelId) {
//        return (DeliveryPersonnel) personnelRepository.findById(personnelId).orElse(null);
//    }
//
//    public DeliveryPersonnel saveDeliveryPersonnel(DeliveryPersonnel personnel) {
//        return personnelRepository.saveAll(personnel);
//    }
//
//    public void deleteDeliveryPersonnel(Long personnelId) {
//        personnelRepository.deleteById(personnelId);
//    }
//}


package com.example.FinalProjectSpringBoot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.FinalProjectSpringBoot.entity.DeliveryPersonnel;
import com.example.FinalProjectSpringBoot.repository.DeliveryPersonnelRepository;

@Service
public class DeliveryPersonnelServiceImpl implements DeliveryPersonnelService {
    private final DeliveryPersonnelRepository personnelRepository;

    public DeliveryPersonnelServiceImpl(DeliveryPersonnelRepository personnelRepository) {
        this.personnelRepository = personnelRepository;
    }

    @Override
    public List<DeliveryPersonnel> getAllDeliveryPersonnel() {
        return personnelRepository.findAll();
    }

    @Override
    public DeliveryPersonnel getDeliveryPersonnelById(Long personnelId) {
        return personnelRepository.findById(personnelId).orElse(null);
    }

    @Override
    public DeliveryPersonnel saveDeliveryPersonnel(DeliveryPersonnel personnel) {
        return personnelRepository.save(personnel);
    }

    @Override
    public void deleteDeliveryPersonnel(Long personnelId) {
        personnelRepository.deleteById(personnelId);
    }
}
