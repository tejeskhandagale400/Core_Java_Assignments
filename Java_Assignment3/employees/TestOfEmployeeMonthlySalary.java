package employees;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestOfEmployeeMonthlySalary {
	
	private EmployeeDetails employee = new EmployeeDetails(555);
	
	@Before
	public void setup()
	{
		employee.setName("Tejas");
	}
	
	@Test
	public void testOfEmployeePositiveMonthlySalary() 
	{	
		employee.setMonthlyBasic(17000);
		assertEquals(17000,employee.getMonthlyBasic(),0.02);
		
	}

	@Test
	public void testOfEmployeeNegativeeMonthlySalary() 
	{
		employee.setMonthlyBasic(-1000);

		assertEquals(0,employee.getMonthlyBasic(),0.02);
	}
}
