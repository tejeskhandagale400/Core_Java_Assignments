package Time;

import static org.junit.Assert.*;

import java.sql.Time;

import org.junit.Test;

public class TimeTest0 {

	@Test
	public void main()
	{
		TimeClass firstTime = new TimeClass();
		firstTime.setTime(5,0);
		firstTime.showTime();
		TimeClass secondTime = new TimeClass();
		secondTime.setTime(22,0);
		secondTime.showTime();
		TimeClass sumOfTime = new TimeClass();
		sumOfTime = sumOfTime.summationOfTwoTimes(firstTime,secondTime);
		sumOfTime.showTime();
		
	}

}
