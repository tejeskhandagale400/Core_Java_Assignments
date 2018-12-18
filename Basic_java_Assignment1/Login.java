import java.util.*;
class Login
{		static String name="TejasKhandagale";
		
		static int count=0;

	public static int checkDetails(String enteredName,String enteredPassword)
	{
	
		String name="TejasKhandagale";
		String password="12345";

		
		
		if(enteredName.equals(name) && enteredPassword.equals(password))
		{
		
		return 1;
		}
	      	
		
			return 0;
		
			
		
	}

	public static void main(String[] args)

	{
		
		
		Scanner inputName= new Scanner(System.in);
	
		
		Scanner inputPassword  = new Scanner(System.in);
		System.out.println("Enter User Name:");
		String enteredName=inputName.next();
		System.out.println("Enter Password:");
		String enteredPassword=inputPassword.next();
		
		
		int result=checkDetails(enteredName,enteredPassword);

		if(result==1)
		{
		System.out.println("Welcome Mr" +name);
		}
	
		if(result==0)
		{
		System.out.println("You have entered Inavalid Credentials Please Enter again");
			while(count<3)
			{
			System.out.println("Enter User Name:");
			enteredName=inputName.next();
			System.out.println("Enter Password:");
			enteredPassword=inputPassword.next();
			int newResult=checkDetails(enteredName,enteredPassword);

				if(newResult==1)
				{
				System.out.println("Welcome Mr" +name);
				break;
				}
			count++;
			
			}

	
		}
	
	}





}	