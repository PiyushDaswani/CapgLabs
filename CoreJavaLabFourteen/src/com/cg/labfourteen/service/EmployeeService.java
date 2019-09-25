package com.cg.labfourteen.service;

import com.cg.labfourteen.dto.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee e);
	public String findScheme(String Desg, double sal);
	public Employee getEmployee(int empId);
}
