package Television;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestForGetCurrentChannelOfTelevision {

	@Test
	public void testForGetCurrentChannelOfTelevisionWhenTelevisionIsOff() 
	{	
		TelevisionClass television = new TelevisionClass(false);
		assertEquals("false",television.getCurrentChannel());
		
	}
	
	@Test
	public void testForGetCurrentChannelOfTelevisionWhenTelevisionIsOn() 
	{	
		TelevisionClass television = new TelevisionClass(true);
		television.getCurrentChannel();
		assertEquals("Select Channel",television.getCurrentChannel());
		
	}
	 
	@Test
	public void testForGetCurrentChannelOfTelevisionWhenTelevisionSettingSomeChannelByNumberIsOn() 
	{	
		TelevisionClass television = new TelevisionClass(true);
		television.changeChannelByChannelNumber(5);
		assertEquals("Sony Mix",television.getCurrentChannel());
		
	}
	
	

	@Test
	public void testForGetCurrentChannelOfTelevisionWhenTelevisionChangingChannelToNextChannelOn() 
	{	
		TelevisionClass television = new TelevisionClass(true);
		television.changeChannelByChannelNumber(5);
		television.changeToNextChannel();
		television.getCurrentChannel();
		assertEquals("Zee Tv",television.getCurrentChannel());
		
	}
}
