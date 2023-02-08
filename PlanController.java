package com.example.subcription;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PlanController {
	@Autowired
	PlanService planService;

	@PostMapping(value = "/add")
	public String SavePlan(@RequestBody Plan e) {
		return planService.savePlan(e);
	}

	@GetMapping(value = "/show/{planId}")
	public Plan getPlan(@PathVariable Long id) {
		return planService.getPlan(id);
	}

	@PutMapping(value = "/update")
	public String updatePlan(@RequestBody Plan e) {
		return planService.updatePlan(e);
	}

	@DeleteMapping(value = "/delete/{id}")
	public String StringPlan(@PathVariable Long id) {
		return planService.deletePlan(id);

	}

}
