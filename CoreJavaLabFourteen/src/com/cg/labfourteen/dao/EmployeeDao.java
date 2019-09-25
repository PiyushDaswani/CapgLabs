package com.cg.labfourteen.dao;

import com.cg.labfourteen.dto.Employee;

public interface EmployeeDao {
	public Employee addEmployee(Employee e);
	public Employee getEmployee(int id);
}
