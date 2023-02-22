package com.example.subcription;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.springframework.data.jpa.domain.Specification;

public class PlanSpecification implements Specification<Plan> {

	 private List<SearchCriteria> list;

	    public PlanSpecification() {
	        this.list = new ArrayList<>();
	    }

	    public void add(SearchCriteria criteria) {
	        list.add(criteria);
	    }

	    public Predicate toPredicate(Root<Plan> root, CriteriaQuery<?> query, CriteriaBuilder builder) {

	    	 List<Predicate> predicates = new ArrayList<>();
	    	 for(SearchCriteria criteria : list) {
	    		  if (criteria.getOperation().equals(SearchOperation.STARTS_WITH)) {
	                 predicates.add(builder.like(
	                         builder.lower(root.get(criteria.getKey())),
	                         "%" + criteria.getValue().toString().toLowerCase() + "%"));
	             } else if (criteria.getOperation().equals(SearchOperation.ENDS_WITH)) {
	                 predicates.add(builder.like(
	                         builder.lower(root.get(criteria.getKey())),
	                         criteria.getValue().toString().toLowerCase() + "%"));
	             }
	    	 }
	    	 return builder.and(predicates.toArray(new Predicate[0]));
	    }
	    	 }
	    
	    	 