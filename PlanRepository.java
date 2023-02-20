package com.example.subcription;

import java.awt.print.Pageable;
import java.util.List;

import org.h2.mvstore.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;


public interface PlanRepository extends JpaRepository<Plan, Long> {
     String FILTER_PLANS_FIRST_NAME_AND_LAST_NAME_QUERY = null;

	@Query("FILTER_PLANS_FIRST_NAME_AND_LAST_NAME_QUERY")
     Page<Plan> findAll(String firstNameFilter, String lastNameFilter, Pageable pageable );

	
     
	
	}
	


	

	



