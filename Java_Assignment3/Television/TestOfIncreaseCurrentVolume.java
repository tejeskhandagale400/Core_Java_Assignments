package Television;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestOfIncreaseCurrentVolume {

 
		@Test
		public void testTestOfIncreaseCurrentVolumeWhenTVIsOff() 
		{	
			TelevisionClass television = new TelevisionClass(false);
			television.setInitialCurrentVolume(5);
			television.decreasereaseCurrentVolume();
			assertEquals(0,television.getCurrentVolume());
			
	 	 
		}
		
		@Test
		public void testTestOfIncreaseCurrentVolumeWhenTVIsOn() 
		{	
			TelevisionClass television = new TelevisionClass(true);
			television.setInitialCurrentVolume(5);
			television.increaseCurrentVolume();
			assertEquals(6,television.getCurrentVolume());
			
	 	 
		}
		

		@Test
		public void testTestOfIncreaseCurrentVolumeWhenTVIsOnAndInitialVolumeIs0n() 
		{	
			TelevisionClass television = new TelevisionClass(true);
			television.setInitialCurrentVolume(0);
			television.increaseCurrentVolume();
			assertEquals(1,television.getCurrentVolume());
			
	 	 
		}
		
		@Test
		public void testTestOfIncreaseCurrentVolumeWhenTVIsOnAndVolumeIsOnExtremelaveleThatIs30Is0n() 
		{	
			TelevisionClass television = new TelevisionClass(true);
			television.setInitialCurrentVolume(30);
			television.increaseCurrentVolume();
			assertEquals(30,television.getCurrentVolume());
			
	 	 
		}
}
