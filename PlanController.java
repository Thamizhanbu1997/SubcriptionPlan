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
	public Plan savePlan(@RequestBody Plan plan) {
		return planService.savePlan(plan);
	}

	@GetMapping(value = "/planId}")
	public Long getPlan(@PathVariable("planId") Long planId) {
		return planService.getPlanById(planId);
	}

	@PutMapping(value = "/planId}")
	public Long updatePlan(@PathVariable ("planId")Long planId) {
		return planService.update(planId);
	}

	@DeleteMapping(value = "/planId}")
	public Long deletePlan(@PathVariable("planId") Long planId) {
		return planService.delete(planId);

	}

}
