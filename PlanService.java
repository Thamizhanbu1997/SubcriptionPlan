
package com.example.subcription;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanService {
	
	@Autowired
	PlanRepository planrepository;

	public Plan save(Plan plan ) {
		return planrepository.save(plan);
	

	}
	
	public Plan getById(Long id) {
		Plan plan= planrepository.findById(id)
		.orElseThrow(() -> new BadRequestException("PLAN_NOT_FOUND"));
		 return plan ;
		 
	}
	
	public Plan updatePlan( Long id, Plan newplan) {
		Plan plan=planrepository. findById(id).orElseThrow(() -> new BadRequestException(""));
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

	public void deletePlan(Long id) {
		Plan plan=planrepository.findById(id)
				.orElseThrow(() -> new BadRequestException("PLAN_NOT_FOUND"));
		planrepository.delete(plan);
		
	}

	
	
	}

	
		
	

	
	

	

	


