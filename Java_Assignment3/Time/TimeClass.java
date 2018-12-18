/*
Write the definition for a class called Time that has hours and minutes as integer. The class has the following behaviours/services/methods:
void setTime(int, int) to set the specified value in object
void showTime() to display time object*/



package Time;

public class TimeClass 
{
	private int hours,minutes;

	public int getHours()
	{
		return hours;
	}

	public void setHours(int hours) 
	{
		
		this.hours = hours;
		
	}

	public int getMinutes() 
	{
		return minutes;
	}

	public void setMinutes(int minutes) 
	{
		this.minutes = minutes;
	}

	public void setTime(int hours, int minutes)
	{
		if(hours>24)
		{
			System.out.println("Eneter Valid Time");
			this.hours = 0;
		}
		else
		{
		this.hours = hours;
		}
		this.minutes = minutes;
		
	}

	public void showTime()
	{
		System.out.println("Given Time is  " +this.hours+ ":" +this.minutes);

		
	}

	public TimeClass summationOfTwoTimes(TimeClass firstTime,TimeClass secondTime) 
	{
		TimeClass sumOfTime = new TimeClass();
		sumOfTime.hours = firstTime.hours + secondTime.hours;
		sumOfTime.minutes = firstTime.minutes + secondTime.minutes;
		while(sumOfTime.minutes>=60)
		{
			if(sumOfTime.minutes>=60)
			{
				sumOfTime.minutes = sumOfTime.minutes -60;
				sumOfTime.hours++;
			}
		 
		}
		 
			if(sumOfTime.hours>=24)
			{
				sumOfTime.hours = sumOfTime.hours - 24;
			}
		 
		
		return sumOfTime;
	}

}
