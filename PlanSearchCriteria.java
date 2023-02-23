package com.example.subcription;

public class PlanSearchCriteria {

	private String name;
	private Integer page;
	private Integer pageSize;
	public String getName() {
		return name;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public void setName(String name) {
		this.name = name;
	}
}
