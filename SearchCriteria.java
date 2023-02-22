package com.example.subcription;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchCriteria {

	private String Key;
    private Object value;
    private SearchOperation operation;
    private boolean orPredicate;

    public SearchCriteria(String filterKey, SearchOperation operation, 
                          Object value){
        super();
        this.setKey(Key);
        this.setOperation(operation);
       
    }

	public String getKey() {
		return Key;
	}

	public void setKey(String key) {
		Key = key;
	}
	
	public Object getValue() {
		return value;
	}

	public SearchOperation getOperation() {
		return operation;
	}

	public void setOperation(SearchOperation operation) {
		this.operation = operation;
	}

	public boolean isOrPredicate() {
		return orPredicate;
	}

	public void setOrPredicate(boolean orPredicate) {
		this.orPredicate = orPredicate;
	}

	
	
}
