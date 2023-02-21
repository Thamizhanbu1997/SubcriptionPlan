package com.example.subcription;

import java.awt.print.Pageable;
import java.util.List;

import org.h2.mvstore.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;


public interface PlanRepository extends JpaRepository<Plan, Long>, JpaSpecificationExecutor<Plan> {
     
     public Page<Plan> findAll(Specification<Plan> spec, Pageable pageable);
     
     public List<Plan> findAll(Specification<Plan> spec); 
	
	}
	


	

	



