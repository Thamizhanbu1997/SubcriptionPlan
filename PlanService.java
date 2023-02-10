
package com.example.subcription;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanService {
	
	@Autowired
	PlanRepository planrepository;

	public String savePlan(Plan plan ) {
		planrepository.save(plan);
		return "Plan success";

	}

	public Plan getPlanById(Long planId) {
		return planrepository.findById(planId).get();
	}

	public String updatePlan(Plan plan) {
		planrepository.save(plan);
		return "Plan updated";

	}

	public String delete(Long planId) {
		planrepository.deleteById(planId);
		return " Plan deleted";
	}

}
