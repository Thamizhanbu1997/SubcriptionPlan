
package com.example.subcription;





import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanService {
	
	@Autowired
	PlanRepository planrepository;

	public Plan save(Plan plan ) {
		return planrepository.save(plan);
	

	}
	
	public Plan getById(Long planId) {
		Plan plan= planrepository.findById(planId)
		.orElseThrow(() -> new BadRequestException("PLAN_NOT_FOUND"));
		 return plan ;
		 
	}
	
	public Plan updatePlan( Long planId, Plan plan) {
		Plan plans=planrepository. findById(planId).orElseThrow(() -> new BadRequestException(""));
		plans.setName(plan.getName());
		plans.setType(plan.getType());
		plans.setMonthlyAmount(plan.getMonthlyAmount());
		plans.setYearlyAmount(plan.getYearlyAmount());
		plans.setMonthlyDays(plan.getMonthlyDays());
		plans.setYearlyDays(plan.getYearlyDays());
		plans.setTax(plan.getTax());
		plans.setMonthlyCancel(plan.getMonthlyCancel());
		plans.setMonthlyTrips(plan.getMonthlyTrips());
		plans.setYearlyTrips(plan.getYearlyTrips());
		plans.setCreatedBy(plan.getCreatedBy());
		plans.setCreatedOn(plan.getCreatedOn());
		plans.setModifiedBy(plan.getModifiedBy());
		plans.setModifiedOn(plan.getModifiedOn());
		planrepository.save(plans);
	    return plan;

	}

	public void delete(Long planId) {
		Plan plan=planrepository.findById(planId)
				.orElseThrow(() -> new BadRequestException("PLAN_NOT_FOUND"));
		planrepository.delete(plan);
		
	}

	
	}

	
		
	

	
	

	

	


