
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
	
	public Long getPlanById(plan) {
		Plan plan= planrepository.findByPlanId(planid)
		.orElseThrow(() -> new BadRequestException("PLAN_NOT_FOUND"));
		 return plan ;
		 
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

	

	


