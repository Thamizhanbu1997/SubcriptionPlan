
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
	
	public Plan updatePlan( Long planId, Plan newplan) {
		Plan plan=planrepository. findById(planId).orElseThrow(() -> new BadRequestException(""));
		plan.setName(newplan.getName());
		plan.setType(newplan.getType());
		plan.setMonthlyAmount(newplan.getMonthlyAmount());
		plan.setYearlyAmount(newplan.getYearlyAmount());
		plan.setMonthlyDays(newplan.getMonthlyDays());
		plan.setYearlyDays(newplan.getYearlyDays());
		plan.setTax(newplan.getTax());
		plan.setMonthlyCancel(newplan.getMonthlyCancel());
		plan.setMonthlyTrips(newplan.getMonthlyTrips());
		plan.setYearlyTrips(newplan.getYearlyTrips());
		plan.setCreatedBy(newplan.getCreatedBy());
		plan.setCreatedOn(newplan.getCreatedOn());
		plan.setModifiedBy(newplan.getModifiedBy());
		plan.setModifiedOn(newplan.getModifiedOn());
		planrepository.save(newplan);
	    return plan;

	}

	public void deletePlan(Long planId) {
		Plan plan=planrepository.findById(planId)
				.orElseThrow(() -> new BadRequestException("PLAN_NOT_FOUND"));
		planrepository.delete(plan);
		
	}

	
	}

	
		
	

	
	

	

	


