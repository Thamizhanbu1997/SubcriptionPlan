
package com.example.subcription;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanService {
	@Autowired
	
	PlanDao plandao;

	public String savePlan(Plan plan) {
		return plandao.savePlan(plan);

	}

	public Plan getPlan(Long planId) {
		return plandao.getPlan(planId);

	}

	public String updatePlan(Plan planId) {
		
		return plandao.updatePlan(planId);
	}

	public String deletePlan(Long planId) {
		return plandao.deletePlan(planId);
	}
}
