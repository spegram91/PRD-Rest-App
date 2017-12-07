package com.revature.PRD.REST.PRDREST;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

	public static List<DepartmentDao> deptList = new ArrayList<>();

	static {
		deptList.add(new DepartmentDao("Engineering"));
		deptList.add(new DepartmentDao("IT"));
		deptList.add(new DepartmentDao("Human Resources"));
		deptList.add(new DepartmentDao("Marketing"));
		deptList.add(new DepartmentDao("Accounting"));
		deptList.add(new DepartmentDao("Sales"));
		deptList.add(new DepartmentDao("Insurance"));
	}

	public static List<DepartmentDao> getAllDepartments() {
		return deptList;
	}

	public static DepartmentDao getDepartmentByName(String name) {
		for (DepartmentDao dept : deptList) {
			if (dept.getName().equals(name)) {
				return dept;
			}
		}
		return null;
	}
}
