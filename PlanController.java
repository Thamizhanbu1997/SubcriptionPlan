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
	public Plan createPlan(@RequestBody Plan plan) {
		return planService.save(plan);
		
	}

	@GetMapping(value = "/plan/{id}")
	public Plan getPlan(@PathVariable("planId") Long planId) {
		return planService.getById(plan) ;
	}

	@PutMapping(value = "/plan/{id}")
	public Plan updatePlan(@PathVariable ("planId")Long planId, Plan plan) {
		return planService.updatePlan(planId,plan);
	}

	@DeleteMapping(value = "/plan/{id}")
	public Plan deletePlan(@PathVariable("planId") Long planId) {
		return planService.getById(planId);

	}

}
