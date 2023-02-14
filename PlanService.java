
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
	
	public Plan getById(Long planId) {
		Plan plan= planrepository.findById(planId)
		.orElseThrow(() -> new BadRequestException("PLAN_NOT_FOUND"));
		 return plan ;
		 
	}
	
	public Plan update( Long planId) {
		planrepository. save(plan);
	return plan;

	}

	public Plan delete(Long planId) {
		planrepository.delete(plan);
		return plan;
	}

	
	}

	

	


