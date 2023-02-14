
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
	
	public Plan updatePlan( Long planId, Plan plans) {
		Plan plan=planrepository. findById(planId).orElseThrow(() -> new BadRequestException(""));
		plan.setName(plans.getName());
		plan.setType(plans.getType());
		plan.setMonthlyAmount(plans.getMonthlyAmount());
		plan.setYearlyAmount(plans.getYearlyAmount());
		plan.setMonthlyDays(plans.getMonthlyDays());
		plan.setYearlyDays(plans.getYearlyDays());
		plan.setTax(plans.getTax());
		plan.setMonthlyCancel(plans.getMonthlyCancel());
		plan.setMonthlyTrips(plans.getMonthlyTrips());
		plan.setYearlyTrips(plans.getYearlyTrips());
		plan.setCreatedBy(plans.getCreatedBy());
		plan.setCreatedOn(plans.getCreatedOn());
		plan.setModifiedBy(plans.getModifiedBy());
		plan.setModifiedOn(plans.getModifiedOn());
		planrepository.save(plans);
	    return plan;

	}

	public void deletePlan(Long planId) {
		Plan plan=planrepository.findById(planId)
				.orElseThrow(() -> new BadRequestException("PLAN_NOT_FOUND"));
		planrepository.delete(plan);
		
	}

	
	}

	
		
	

	
	

	

	


