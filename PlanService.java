
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
	
	public Long getPlanById(Long planId) {
		Plan plan= planrepository.findByPlanId(planId)
		.orElseThrow(() -> new BadRequestException("message"));
		 return planId ;
		 
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

	

	


