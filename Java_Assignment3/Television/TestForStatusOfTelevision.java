package Television;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestForStatusOfTelevision {

	@Test
	public void testForSetStatusIsOFF()
	{
		TelevisionClass television = new TelevisionClass(false);
		assertFalse(television.getStatusOfTelevision());

	}
	
	@Test
	public void testForSetStatusIsON()
	{
		TelevisionClass television = new TelevisionClass(true);
		assertTrue(television.getStatusOfTelevision());

	}

}
