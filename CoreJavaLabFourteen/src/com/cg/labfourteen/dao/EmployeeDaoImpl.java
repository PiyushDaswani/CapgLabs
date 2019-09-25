package com.cg.labfourteen.dao;

import java.util.ArrayList;
import java.util.List;

import com.cg.labfourteen.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	List<Employee> empList=new ArrayList<Employee>();
	
	@Override
	public Employee addEmployee(Employee e) {
		// TODO Auto-generated method stub
		empList.add(e);
		return e;
	}

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		for(Employee emp:empList) {
			if(emp.getEmpId()==id) {
				return emp;
			}
		}
		return null;
	}

}
