package com.example.subcription;



import java.util.List;

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
    
	@GetMapping(value = "{id}")
	public Plan getPlan(@PathVariable("id") Long id) {
		return planService.getById(plan) ;
	}
	@GetMapping
	public List<Plan> getallPlans() {
		return planService.findAll();
	}

	@PutMapping(value = "{id}")
	public Plan updatePlan(@PathVariable ("id")Long id, Plan plan) {
		return planService.updatePlan(id,plan);
	}

	@DeleteMapping(value = "{id}")
	public Plan deletePlan(@PathVariable("id") Long id) {
		return planService.getById(id);

	}

}
