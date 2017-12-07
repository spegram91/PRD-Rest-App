package com.revature.PRD.REST.PRDREST;

public class DepartmentDao {
	
	private String name;
	
	
	public DepartmentDao() {
		super();
	}
	
	
	public DepartmentDao(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Name : " + name;
	}
	
	
}
