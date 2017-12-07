package com.revature.PRD.REST.PRDREST;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(path = "/departments")
public class DepartmentController {

	@RequestMapping(method = RequestMethod.GET)
	public List<DepartmentDao> getAllDepartments() {
		return DepartmentService.getAllDepartments();	
	}
	
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public DepartmentDao getDepartmentByName(@PathVariable("name") String name) {
		return DepartmentService.getDepartmentByName(name);
	}
}
