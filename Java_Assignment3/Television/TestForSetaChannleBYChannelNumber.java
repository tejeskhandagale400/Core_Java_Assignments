package Television;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestForSetaChannleBYChannelNumber {

	@Test
	public void testForChangeCurrentChannelByChannelNumberOfTelevisionWhenTelevisionIsOff() 
	{	
		TelevisionClass television = new TelevisionClass(false);
		television.changeChannelByChannelNumber(2);
		assertEquals("false",television.getCurrentChannel());
		
	}
	
	@Test
	public void testForChangeCurrentChannelByChannelNumberOfTelevisionWhenTelevisionIsOn() 
	{	
		TelevisionClass television = new TelevisionClass(true);
		television.changeChannelByChannelNumber(2);
		assertEquals("Star Utsav",television.getCurrentChannel());
		
	}
	
	@Test
	public void testForChangeCurrentChannelByChannelNumberOfTelevisionWhenTelevisionIsOnAndChannelNumberDoesNotExist() 
	{	
		TelevisionClass television = new TelevisionClass(true);
		television.changeChannelByChannelNumber(15);
		assertEquals("Channel Number Does Not Exist",television.getCurrentChannel());
		
	}

}
