
package com.example.subcription;





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
		  planrepository.findById(planId);
		  return planId;
		 
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

	

	


