package Time;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestForSummationOfTwoTimes {
	
	private TimeClass firstTime = new TimeClass();
	private TimeClass secondTime = new TimeClass();
	private TimeClass sumOfTime = new TimeClass();
	
	@Test
	public void testOfSummationOfTimesOfMinutesLessThanSixtyCheckingHours()
	{
		
		firstTime.setTime(5,30);
		secondTime.setTime(6,30);
		sumOfTime = sumOfTime.summationOfTwoTimes(firstTime,secondTime);
		assertEquals(12,sumOfTime.getHours());
		
	}
	
	@Test
	public void testOfSummationOfTimesOfMinutesLessThanSixtyCheckingMinutes()
	{
		
		firstTime.setTime(5,30);
		secondTime.setTime(6,30);
		sumOfTime = sumOfTime.summationOfTwoTimes(firstTime,secondTime);
		assertEquals(0,sumOfTime.getMinutes());
		
	}
	
	@Test
	public void testOfSummationOfTimesOfOneOfTimeHasMinutesEqualsToSixtyCheckingHours()
	{
		
		firstTime.setTime(5,60);
		secondTime.setTime(5,0);
		sumOfTime = sumOfTime.summationOfTwoTimes(firstTime,secondTime);
		assertEquals(11,sumOfTime.getHours());	
	}
	

	@Test
	public void testOfSummationOfTimesOfBothOfTimeHasMinutesEqualsToSixtyCheckingHours()
	{
		
		firstTime.setTime(5,60);
		secondTime.setTime(5,60);
		sumOfTime = sumOfTime.summationOfTwoTimes(firstTime,secondTime);
		assertEquals(12,sumOfTime.getHours());
		
	}
	

	@Test
	public void testOfSummationOfTimesOfBothOfTimeHasMinutesEqualsToSixtyCheckingMinutes()
	{
		
		firstTime.setTime(5,60);
		secondTime.setTime(5,60);
		sumOfTime = sumOfTime.summationOfTwoTimes(firstTime,secondTime);
		assertEquals(0,sumOfTime.getMinutes());
		
	}
	
	@Test
	public void testOfSummationOfTimesOfOneOfTimeHasHoursEqualsToTwentyFourCheckingHours()
	{
		
		firstTime.setTime(24,0);
		secondTime.setTime(5,50);
		sumOfTime = sumOfTime.summationOfTwoTimes(firstTime,secondTime);
		sumOfTime.showTime();
		assertEquals(5,sumOfTime.getHours());
		
	}
	

	@Test
	public void testOfSummationOfTimesOfOneOfTimeHasHoursEqualsToTwentyFourCheckingMinutes()
	{
		
		firstTime.setTime(24,0);
		secondTime.setTime(5,50);
		sumOfTime = sumOfTime.summationOfTwoTimes(firstTime,secondTime);
		sumOfTime.showTime();
		assertEquals(50,sumOfTime.getMinutes());
		
	}
	
	@Test
	public void testOfSummationOfTimesOfBothOfTimeHasHoursEqualsToTwentyFourCheckingHours()
	{
		
		firstTime.setTime(24,0);
		secondTime.setTime(24,0);
		sumOfTime = sumOfTime.summationOfTwoTimes(firstTime,secondTime);
		sumOfTime.showTime();
		assertEquals(0,sumOfTime.getHours());
		
	}
	
	@Test
	public void testOfSummationOfTimesOfBothOfTimeHasHoursEqualsToTwentyFourANdSomeMinutesCheckingMinutes()
	{
		
		firstTime.setTime(24,50);
		secondTime.setTime(24,0);
		sumOfTime = sumOfTime.summationOfTwoTimes(firstTime,secondTime);
		sumOfTime.showTime();
		assertEquals(50,sumOfTime.getMinutes());
		
	}
	
	@Test
	public void testOfSummationOfTimesOfBothOfTimeHasZerioHoursAndOneHasSixtyMinutesCheckingHours()
	{
		
		firstTime.setTime(0,60);
		secondTime.setTime(0,0);
		sumOfTime = sumOfTime.summationOfTwoTimes(firstTime,secondTime);
		sumOfTime.showTime();
		assertEquals(1,sumOfTime.getHours());
		
	}
	
	
	@Test
	public void testOfSummationOfTimesOfBothOfTimeHasZerioHoursAndOneHasSomeMinutesCheckingMinutes()
	{
		
		firstTime.setTime(0,50);
		secondTime.setTime(0,0);
		sumOfTime = sumOfTime.summationOfTwoTimes(firstTime,secondTime);
		sumOfTime.showTime();
		assertEquals(50,sumOfTime.getMinutes());
		
	}
	
}
