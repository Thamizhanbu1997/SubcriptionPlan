
package com.example.subcription;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanService {
	@Autowired
	
	PlanDao plandao;

	public String savePlan(Plan e) {
		return plandao.savePlan(e);

	}

	public Plan getPlan(Long id) {
		return plandao.getPlan(id);

	}

	public String updatePlan(Plan e) {
		return plandao.updatePlan(e);
	}

	public String deletePlan(Long id) {
		return plandao.deletePlan(id);
	}
}
