
package com.example.subcription;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.h2.mvstore.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class PlanService {
	
	@Autowired
	PlanRepository planrepository;

	public Plan save(Plan plan ) {
		return planrepository.save(plan);
	

	}
	
	public Plan getById(Long id) {
		Plan plan= planrepository.findById(id)
		.orElseThrow(() -> new BadRequestException("PLAN_NOT_FOUND"));
		 return plan ;
		 
	}
	
	public Page findAll(PlanSearchCriteria criteria) {
		
		   return planrepository.findAll());
		}

	
	 public Specification<Plan> specification(PlanSearchCriteria criteria) {
		   return new Specification<Plan>() {
			   @Override
			   public Predicate toPredicate(Root<Plan> root, CriteriaQuery<?> query, CriteriaBuilder cBuilder) {
			   
			List<Predicate> predicates= new ArrayList<Predicate>();
			if(criteria.getName() != null) {
				predicates.add(cBuilder.like(cBuilder.lower(root.get("name")),"%" + criteria.getName().toLowerCase() + "%"));
			}
			if(criteria.getPage()!=null) {
				predicates.add(cBuilder.and(cBuilder.equal(root.get("page"),criteria.getPage())));
			}
			if(criteria.getPageSize()!=null) {
				predicates.add(cBuilder.and(cBuilder.equal(root.get("pageSize"), criteria.getPageSize())));
				
			}
			return cBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
			   }
			   };
	
}
	public Plan updatePlan( Long id, Plan newplan) {
		Plan plan=planrepository. findById(id).orElseThrow(() -> new BadRequestException(""));
		plan.setName(newplan.getName());
		plan.setType(newplan.getType());
		plan.setMonthlyAmount(newplan.getMonthlyAmount());
		plan.setYearlyAmount(newplan.getYearlyAmount());
		plan.setMonthlyDays(newplan.getMonthlyDays());
		plan.setYearlyDays(newplan.getYearlyDays());
		plan.setTax(newplan.getTax());
		plan.setMonthlyCancel(newplan.getMonthlyCancel());
		plan.setMonthlyTrips(newplan.getMonthlyTrips());
		plan.setYearlyTrips(newplan.getYearlyTrips());
		plan.setCreatedBy(newplan.getCreatedBy());
		plan.setCreatedOn(newplan.getCreatedOn());
		plan.setModifiedBy(newplan.getModifiedBy());
		plan.setModifiedOn(newplan.getModifiedOn());
		planrepository.save(newplan);
	    return plan;

	}

	public void deletePlan(Long id) {
		Plan plan=planrepository.findById(id)
				.orElseThrow(() -> new BadRequestException("PLAN_NOT_FOUND"));
		planrepository.delete(plan);
		
	}

	

	
	  

	

	
	

	

	
	 
	
	
	}

	
		
	

	
	

	

	


