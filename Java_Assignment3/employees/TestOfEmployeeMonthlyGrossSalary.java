package employees;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestOfEmployeeMonthlyGrossSalary {
	private EmployeeDetails employee = new EmployeeDetails(555);

	@Before
	public void setupForEmployee() 
	{
		employee.setName("Tejas");
		employee.setMonthlyBasic(17000);
	}
	@Test
	public void tesOfAnnualBasicPositive()
	{
		assertEquals(27550,employee.getMonthlyGrossSalary(),0.02);


	}

	@Test
	public void tesOfAnnualBasicOfNegativeSalary()
	{
		employee.setMonthlyBasic(-2);

		assertEquals(2050,employee.getMonthlyGrossSalary(),0.02);


	}
}
