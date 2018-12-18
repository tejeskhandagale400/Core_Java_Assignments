import java.util.*;  
class DisplayDate
{

	public static void main(String[] args)
	{
	  	Scanner input=new Scanner(System.in);
		System.out.println("Enter date in DD,MM,YYYY format:");
		String enteredDate=input.next();
		
		String day=enteredDate.substring(0,2);
		String month=enteredDate.substring(3,5);
		String year=enteredDate.substring(6,10);
		
		System.out.println(month);
		switch(month)

		{
			case "01":
			month="Janaury";
			break;

			case "02":
			month="Febraury";
			break;

			case "03":
			month="March";
			break;

			case "04":
			month="April";
			break;

			case "05":
			month="May";
			break;

			case "06":
			month="Jun";
			break;

			case "07":
			month="July";
			break;

			case "08":
			month="Augast";
			break;


			case "09":
			month="September";
			break;

			case "10":
			month="October";
			break;

			case "11":
			month="November";
			break;

			case "12":
			month="December";
			break;

			}
		System.out.println(day+"/"+month+"/"+year);
			 


	}
	



}