package employees;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestOfEmployeeAnnualBasic {
	
	private EmployeeDetails employee = new EmployeeDetails(555);

	@Before
	public void setupForEmployee() 
	{	employee.setName("Tejas");
		employee.setMonthlyBasic(17000);
	}
	@Test
	public void tesOfAnnualBasic()
	{
		assertEquals(204000,employee.getAnnualBasic(),0.02);


	}

}
