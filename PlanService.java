
package com.example.subcription;





import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanService {
	
	@Autowired
	PlanRepository planrepository;

	public Plan savePlan(Plan plan ) {
		planrepository.save(plan);
		return plan;

	}
	
	public Long getPlanById(List<Plan> plan) {
		for(Plan i:plan) {
		Optional<Plan> plans=planrepository.findByPlanId(i.getId());
		 if(plans.isPresent()) {
			 PlanRepository.findById(plans);
			 
		 }
		 else {
			 
		 }
		  
		 
	}
	}
	public Long update( Long planId) {
	planrepository.updateById(planId);
	return planId;

	}

	public Long delete(Long planId) {
		planrepository.deleteById(planId);
		return planId;
	}

	}

	

	


