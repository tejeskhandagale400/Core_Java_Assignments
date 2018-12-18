/* Design a Television class, refer below hints for its state and behavior and test it Using JUnit:-
 state (on/off), 
 current volume, 
 current channel, 
 increase and decrease volume and 
 change channel
 turn it on and off.*/



package Television;

public class TelevisionClass 
{
	
	private boolean state;
	private int currentChannel;
	private int currentVolume;

	 TelevisionClass(boolean state)  //argument type Constructor For initializing the Status
	 {
 		this.state = state;
	 }


	
	public void setState(boolean state)
	{
		this.state = state;
	}
	
	public String getCurrentChannel() 
	{	
		 String channel ="";
		if(state)
		{
			if(currentChannel <14)
			{
			 switch (currentChannel)
			 {
			 case 1: channel="DD National";
				break;
			 case 2: channel="Star Utsav";
				break;
			 case 3: channel="Star Plus";
				break;
			 case 4: channel="Sony Pal";
				break;
			 case 5: channel="Sony Mix";
				break;
			 case 6: channel="Zee Tv";
				break;
			 case 7: channel="Zee News";
				break;
			 case 8: channel="Cartoon Network";
				break;
			 case 9: channel="Pogo";
				break;
			 case 10: channel="Zee Marathi";
				break;
			 case 11: channel="DD News";
				break;
			 case 12: channel="9XM";
				break;
			 case 13: channel="B4U";
				break;
			 case 14: channel="Discovery";
				break;
				
			 default: channel="Select Channel";
				break;
			 }
			}
			
			else
			{
				channel="Channel Number Does Not Exist";
			}
		}	 
		else
		{
			 channel="Please Turn On TV";
			 System.out.println("Please Turn On TV");
			 return "false";
		}
		
		
		System.out.println("Channel is : " + channel + "   channel No:" +currentChannel );
		return channel;
	}
	
	public void changeChannelByChannelNumber(int currentChannel)      //here the channel is change by passing channel number
	{
		if(state)
		{
		this.currentChannel = currentChannel;
		}
		else
		{
			 System.out.println("Please Turn On TV");

		}
	}
	
	public int getCurrentVolume()          	//it gives the current volume
	{
		if(state)
		{
		System.out.println("Current Volume : " +currentVolume);
		return currentVolume;
		}
		else
		{
			 System.out.println("Please Turn On TV");
			 return 0;
		}
 
	}
	
	public void increaseCurrentVolume() 		//It increses the volume 
	{
		if(state)
		{
			if(currentVolume<30)
			{
				this.currentVolume ++;
			}
			else
			{
				this.currentVolume =30;

			}
		}
		
		else
		{
			 System.out.println("Please Turn On TV");

		}
		
	}

	public boolean getStatusOfTelevision() 				//it gives the status of TV 
	{
		String Status =state ? "Television is :On" : "Television is :Off";
		System.out.println(Status);
		return state;
		
		
	}

	public void decreasereaseCurrentVolume()        	//It decreases the volume	
	{
		if(state)
		{
			if(currentVolume>0)
				{
				this.currentVolume --;
				
				}
			else
			{
				this.currentVolume=0;
			}
		}
		else
		{
			 System.out.println("Please Turn On TV");

		}

		
	}

	public void changeToNextChannel()    	//here the channel is change to next channle
	{
		if(state)
		{
		this.currentChannel++;
		System.out.println("Channel Change to ");
		getCurrentChannel();
		}
		
	}

	public void changeToPreviousChannel() 	//here the channel is change to previous channle
	{
		if(state)
		{
			System.out.println("Channel Change to ");
			this.currentChannel--;
			getCurrentChannel();

		}
		
	}



	public void setInitialCurrentVolume(int i) 		//it is use to initiate the volume when TV in Turn ON
	{
		if(state)
		{
		this.currentVolume = i;;
		}
		
	}
	
}
