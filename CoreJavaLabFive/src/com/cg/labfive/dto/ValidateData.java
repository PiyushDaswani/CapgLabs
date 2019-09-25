package com.cg.labfive.dto;

import com.cg.labfive.exception.EmployeeException;
import com.cg.labfive.exception.UserException;

public class ValidateData {

	public boolean validateName(String s) throws UserException {
		String pattern = "^[A-Za-z]{1,} [A-Za-z]{1,}$";
		if (!s.matches(pattern))
			throw new UserException("Enter valid Name");
		return true;
	}

	public boolean validateAge(int age) throws UserException {
		if (age < 15) {
			throw new UserException("Enter a valid age");
		}
		return true;
	}
	
	public boolean validateSalary(double sal) throws EmployeeException{
		if(sal<3000) {
			throw new EmployeeException("Salary cant be less than 3000");
		}
		return true;
	}

}
