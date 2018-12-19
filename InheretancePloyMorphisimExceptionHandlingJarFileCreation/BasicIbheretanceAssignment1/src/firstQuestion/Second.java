
//Information Of Person

package firstQuestion;

public class Second 
{
	private String personName ,sirName;
	private String phoneNumber;
	private int day, month , year;
	private int dob;

	

	Second( String personName , String sirName)
	{
		this.personName = personName;
		this.sirName = sirName;
	}

	@Override
	public String toString() {
		return "Second [getPhoneNumber()=" + getPhoneNumber() + "]";
	}
	public String getPhoneNumber() 
	{
		return phoneNumber;
		
	}

	public void setPhoneNumber(String phoneNumber) 
	{
		this.phoneNumber = phoneNumber;
	}

	 
	public void setDob (int day,int month , int year) 
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	 
}
