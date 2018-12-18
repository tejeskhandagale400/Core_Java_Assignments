package employees;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestOfEmployeeMonthlyDeductions
{
	
	private EmployeeDetails employee = new EmployeeDetails(20140344);

	@Before
	public void setupForEmployee() 
	{	employee.setName("Tejas");
		employee.setMonthlyBasic(17000);
	}
	@Test
	public void tesOfAnnualBasicPositive()
	{
		assertEquals(1800,employee.getMonthlyDeductions(),0.02);


	}

	@Test
	public void tesOfAnnualBasicOfNegativeSalary()
	{
		employee.setMonthlyBasic(-2);

		assertEquals(50,employee.getMonthlyDeductions(),0.02);


	}


}
