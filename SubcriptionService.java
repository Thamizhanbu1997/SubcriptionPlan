package com.example.subcription;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubcriptionService {
@Autowired
SubcriptionRepository subcriptionRepository;

public Subcription save(Subcription subcription) {
	return subcriptionRepository.save(subcription);
	
}

public Subcription getById(Long id) {
	Subcription subcription=subcriptionRepository.findById(id)
			.orElseThrow(() -> new BadRequestException("SUBCRIPTION_NOT_FOUND"));
	    return subcription;
}

public Subcription updateSubcription(Long id, Subcription newsubcription) {
	Subcription subcription= subcriptionRepository.findById(id)
			.orElseThrow(() -> new BadRequestException(""));
	subcription.setDriverId(newsubcription.getDriverId());
	subcription.setVehicleId(newsubcription.getVehicleId());
	subcription.setStatus(newsubcription.getStatus());
	subcription.setType(newsubcription.getType());
	subcription.setStart(newsubcription.getStart());
	subcription.setEnd(newsubcription.getEnd());
	subcription.setAmount(newsubcription.getAmount());
	subcription.setTax(newsubcription.getTax());
	subcription.setTotal(newsubcription.getTotal());
	subcription.setCancelQuota(newsubcription.getCancelQuota());
	subcription.setTripQuota(newsubcription.getTripQuota());
	subcriptionRepository.save(newsubcription);
	return subcription;
	
}
public void deleteSubcription(Long id) {
	Subcription subcription=subcriptionRepository.findById(id)
			.orElseThrow(() -> new BadRequestException("SUBCRIPTION_NOT_FOUND"));
	subcriptionRepository.delete(subcription);
}
}
