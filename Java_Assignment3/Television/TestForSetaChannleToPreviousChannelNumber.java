package Television;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestForSetaChannleToPreviousChannelNumber 
{


	@Test
	public void testForChangeCurrentChannelToPreviousChannelNumberOfTelevisionWhenTelevisionIsOff() 
	{	
		TelevisionClass television = new TelevisionClass(false);
		television.changeToNextChannel();
		assertEquals("false",television.getCurrentChannel());
		
	}
	
	@Test
	public void testForChangeCurrentChannelToNextChannelNumberOfTelevisionWhenTelevisionIsOn() 
	{	
		TelevisionClass television = new TelevisionClass(true);
		television.changeChannelByChannelNumber(7);
		television.changeToPreviousChannel();
		assertEquals("Zee Tv",television.getCurrentChannel());
		
	}

}
