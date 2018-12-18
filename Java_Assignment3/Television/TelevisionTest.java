package Television;

import static org.junit.Assert.*;

import org.junit.Test;

public class TelevisionTest {

	@Test
	public void main() 
	{
		TelevisionClass television = new TelevisionClass(false);
		
		television.getStatusOfTelevision();
		television.getCurrentChannel();

		
		television.setState(true);
		television.getStatusOfTelevision();

		
		television.changeChannelByChannelNumber(1);
		television.getStatusOfTelevision();
		television.getCurrentChannel();
		television.getCurrentVolume();
		television.increaseCurrentVolume();
		television.getCurrentVolume();
		television.decreasereaseCurrentVolume();
		television.getCurrentVolume();
		television.changeToNextChannel();
		television.changeChannelByChannelNumber(5);
		television.getCurrentChannel();
		television.changeToPreviousChannel();
		television.setState(false);
		television.getStatusOfTelevision();
		television.changeToPreviousChannel();
		television.setInitialCurrentVolume(5);


	}

}
