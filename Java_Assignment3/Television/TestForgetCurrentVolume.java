package Television;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestForgetCurrentVolume {
 
	@Test
		public void testToGettCurrentVolumeTelevisionIsOff() 
		{	
			TelevisionClass television = new TelevisionClass(false);
			television.getCurrentVolume();
			assertEquals("false",television.getCurrentChannel());
			
	 	}
	
	@Test
	public void testToGettCurrentVolumeTelevisionIsOOn() 
	{	
		TelevisionClass television = new TelevisionClass(true);
		television.getCurrentVolume();
		assertEquals(0,television.getCurrentVolume());
		
 	}

	@Test
	public void testToGettCurrentVolumeTelevisionByIncreasingAlsoIsOOn() 
	{	
		TelevisionClass television = new TelevisionClass(true);
		television.increaseCurrentVolume();
		assertEquals(1,television.getCurrentVolume());
		
 	}
	
	@Test
	public void testToGettCurrentVolumeTelevisionIsANdIncreaseAndDecreaseOn() 
	{	
		TelevisionClass television = new TelevisionClass(true);
		television.setInitialCurrentVolume(5);
		television.decreasereaseCurrentVolume();
		assertEquals(4,television.getCurrentVolume());
		
 	}
}
