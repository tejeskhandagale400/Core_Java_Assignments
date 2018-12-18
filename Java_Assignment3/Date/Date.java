import java.util.Arrays;


public class Date 
{
	private int day, month , year;
	
	public Date(int day, int month, int year) 
	{
		if(	(day >0) &&(day<32) && (month>0) && (month<13) && (year>0))     //it chacks wheather the entered date is valid or not
		{
			if(day > 29 && month==2)										//For Validate The entered date is valid or not
			{
				System.out.println("Enter A valid date");
			}
			else
			{
				if((day ==29) && (month==2))
				{ 
					 boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
					 if(isLeapYear)
					 {
  							this.day = day;
							this.month = month;
							this.year = year;
					 }
				}
				
				else
				{
					 
					this.day = day;
					this.month = month;
					this.year = year;
				}
			}
		}
		else
		{
			System.out.println("Enter A valid date");
		}
	}

	@Override
	public String toString() {
		if(	this.day >0 || this.month>0 || this.year>0)     //it execute only on valid date
		{
		return  + day + "/" + month + "/" + year ;
		}
		else
			return null;
	}
/*
	public String toStringForObject()   //My function to convert date into string and return by string
	{
		String dayString =  Integer.toString(day);
		String monthString = Integer.toString(month);
		String yearString = Integer.toString(year);
		
		String date = dayString + "/" + monthString + "/" + yearString;
		System.out.println(date);
		return date;
	}*/

	public boolean isSmaller(Date dateOne, Date dateTwo) 
	{	
		
		if(dateOne.year > dateTwo.year)
		{
			return true;
		}
		
		else
		{
			if(dateOne.year == dateTwo.year)		//it checks weather the year are same or not if not then it will check the greater or less
			{
				if(dateOne.month > dateTwo.month)
				{
					return true;
				}
				else
				{
					if(dateOne.month == dateTwo.month)  			//it checks weather the months are same or not if not then it will return false becoz 1st date is lesser
					{
						if(dateOne.day > dateTwo.day)
						{
							return true;
						}
						else  							//Here we will check when year and month are more of date two and checkimg day of date2 bt if the two date are same it will return false
						{
							return false;
						}
						
					}
				}
					
			}
			return false;
		}
		
	}

	public int[] differenceBetweenTwoDates(Date dateOne, Date dateTwo) //it returns an Array with contains difference of days and months
	{
		int diffDateArray []= new int[3];
		
		diffDateArray[0] = dateOne.day>=dateTwo.day ? dateOne.day - dateTwo.day : dateTwo.day - dateOne.day;
		diffDateArray[1] = dateOne.month>=dateTwo.month ? dateOne.month - dateTwo.month : dateTwo.month - dateOne.month;
		diffDateArray[2] = dateOne.year>=dateTwo.year ? dateOne.year - dateTwo.year : dateTwo.year - dateOne.year;
		
		System.out.println(Arrays.toString(diffDateArray));
		return diffDateArray
				;
	}

}
