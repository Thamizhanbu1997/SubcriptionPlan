package com.example.subcription;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.h2.table.Plan;
import org.hibernate.Criteria;
import org.springframework.data.jpa.domain.Specification;

public class PlanSpecification  {
   
	   private Specification<Plan> specification(PlanSearchCriteria criteria) {
		return new Specification<Plan>() {
		@Override
		
		public Predicate toPredicate(Root<Plan> root, CriteriaQuery<?> query, CriteriaBuilder cBuilder ) {
			List<Predicate> predicates= new ArrayList<Predicate>();
			if(criteria.getName() != null) {
				predicates.add(cBuilder.like(cBuilder.lower(cBuilder.function("replace", String.class, root.get("name"), cBuilder.literal(""), cBuilder.literal(""))),
						criteria.getName().toLowerCase().replace("", "") + "%"));
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
}
