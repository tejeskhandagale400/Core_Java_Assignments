package com.capgemeni.objectReadAndWrite;

import java.io.Serializable;
/**
 * Employee class to initialize object of employee
 * @author Tejas
 *
 */
public class Employee implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Initialization of class members
	 */
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	
	/**
	 * Parameterized constructor
	 * @param employeeId
	 * @param employeeName
	 * @param employeeSalary
	 */
	public Employee(int employeeId, String employeeName, double employeeSalary)
	{
			this.employeeId = employeeId;
			this.employeeName = employeeName;
			this.employeeSalary = employeeSalary;

	}
	
	/**
	 * ToString for getting info of employee
	 */
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName="
				+ employeeName + ", employeeSalary=" + employeeSalary + "]";
	}
	

	

}
