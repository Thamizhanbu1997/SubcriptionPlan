package com.example.subcription;



import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.h2.mvstore.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.bytebuddy.asm.Advice.Return;

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
		return planService.getById(plan ) ;
	}
	
	@GetMapping
	public Page<Plan> findAll(@RequestParam(defaultValue = "") String firstNameFilter,
	      @RequestParam(defaultValue = "") String lastNameFilter,
	      @RequestParam(defaultValue = "") int page,
	      @RequestParam(defaultValue = "") int size) {
	    	return planService.findAll(firstNameFilter, lastNameFilter, page, size); 
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
