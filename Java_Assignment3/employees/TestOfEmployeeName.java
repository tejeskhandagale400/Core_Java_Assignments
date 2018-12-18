package employees;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestOfEmployeeName {
	private EmployeeDetails employee = new EmployeeDetails(20140344);

	@Test
	public void testOfEmployeeValidName()
	{
		employee.setName("ujwala");
		assertEquals("ujwala",employee.getName());
		
	}
 
 	@Test 
 	public void testOfEmployeeInvalidName()
 	{
 		employee.setName("tejas");
 		assertEquals("tejas",employee.getName());
 		
 	}
}
