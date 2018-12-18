package Television;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestOfDecreaseCurrentVolumeTest {


	@Test
	public void testTestOfDecreaseCurrentVolumeWhenTVIsOff() 
	{	
		TelevisionClass television = new TelevisionClass(false);
		television.setInitialCurrentVolume(5);
		television.decreasereaseCurrentVolume();
		assertEquals(0,television.getCurrentVolume());
		
 	 
	}
	
	@Test
	public void testTestOfDecreaseCurrentVolumeWhenTVIsOn() 
	{	
		TelevisionClass television = new TelevisionClass(true);
		television.setInitialCurrentVolume(5);
		television.decreasereaseCurrentVolume();
		assertEquals(4,television.getCurrentVolume());
		
 	 
	}
	

	@Test
	public void testTestOfDecreaseCurrentVolumeWhenTVIsOnAndInitialVolumeIs0() 
	{	
		TelevisionClass television = new TelevisionClass(true);
		television.setInitialCurrentVolume(0);
		television.decreasereaseCurrentVolume();
		assertEquals(0,television.getCurrentVolume());
		
 	 
	}

}
