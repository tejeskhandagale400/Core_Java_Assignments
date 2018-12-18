package employees;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestOfEmployeeId {
	
	private EmployeeDetails employee = new EmployeeDetails(20140344);

	@Test
	public void testTocheckValidIdOfEmployee() {
		
		assertEquals(20140344,employee.getId());
	}

}
