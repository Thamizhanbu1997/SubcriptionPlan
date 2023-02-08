package com.example.subcription;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PlanDao {
	@Autowired
	PlanRepository planrepository;

	public String savePlan(Plan e) {
		planrepository.save(e);
		return "Plan success";

	}

	public Plan getPlan(Long id) {
		return planrepository.findAll().get(0);
	}

	public String updatePlan(Plan e) {
		planrepository.save(e).getId();
		return "Plan updated";

	}

	public String deletePlan(Long id) {
		planrepository.deleteById(id);
		return " Plan deleted";
	}

}
