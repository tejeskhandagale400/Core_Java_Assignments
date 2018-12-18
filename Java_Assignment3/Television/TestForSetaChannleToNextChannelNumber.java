package Television;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestForSetaChannleToNextChannelNumber {

	@Test
	public void testForChangeCurrentChannelToNextChannelNumberOfTelevisionWhenTelevisionIsOff() 
	{	
		TelevisionClass television = new TelevisionClass(false);
		television.changeToNextChannel();
		assertEquals("false",television.getCurrentChannel());
		
	}
	
	@Test
	public void testForChangeCurrentChannelToNextChannelNumberOfTelevisionWhenTelevisionIsOn() 
	{	
		TelevisionClass television = new TelevisionClass(true);
		television.changeToNextChannel();
		assertEquals("DD National",television.getCurrentChannel());
		
	}
	
	
	

}
