package com.example.subcription;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/plan")
public class PlanController {
	@Autowired
	PlanService planService;

	@PostMapping
	public String savePlan(@RequestBody Plan plan) {
		return planService.savePlan(plan);
	}

	@GetMapping(value = "/planId}")
	public Plan getPlan(@PathVariable("planId") Long planId) {
		return planService.getPlan(planId);
	}

	@PutMapping(value = "/planId}")
	public String updatePlan(@RequestBody Plan planId) {
		return planService.updatePlan(planId);
	}

	@DeleteMapping(value = "/planId}")
	public String deletePlan(@PathVariable("planId") Long planId) {
		return planService.deletePlan(planId);

	}

}
