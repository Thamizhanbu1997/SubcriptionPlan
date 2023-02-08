package com.example.subcription;



import org.springframework.data.jpa.repository.JpaRepository;


public interface PlanRepository extends JpaRepository<Plan, Integer> {

	void deleteById(Long id);

	

}

