package com.cg.labfourteen.service;

import com.cg.labfourteen.dto.Employee;
import com.cg.labfourteen.dao.*;

public class EmployeeServiceImpl implements EmployeeService{

	EmployeeDao dao = new EmployeeDaoImpl();
	
	@Override
	public Employee addEmployee(Employee e) {
		// TODO Auto-generated method stub
		return dao.addEmployee(e);
	}

	@Override
	public String findScheme(String Desg, double sal) {
		// TODO Auto-generated method stub
		if((sal>5000 && sal<20000) && Desg.equals("System Associate")) {
			return "Scheme C";
		}
		else if((sal>=20000 && sal<40000) && Desg.equals("Programmer")) {
			return "Scheme B";
		}
		else if(sal>=40000 && Desg.equals("Manager")) {
			return "Scheme A";
		}
		else if(sal<5000 && Desg.equals("Clerk")) {
			return "No Scheme";
		}
		else
			return "No Scheme mapped";
	}

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return dao.getEmployee(id);
	}

	
	
	
}