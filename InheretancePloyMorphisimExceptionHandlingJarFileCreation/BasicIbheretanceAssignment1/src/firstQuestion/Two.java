package firstQuestion;

public class Two 
{
/**
 * 
 * @param args
 */
	public static void main(String [] args)
	{
		First firstObject = new First(4,5);
		Second secondObject = new Second("Tejas","Khandagale");
		System.out.println("Addition is "+firstObject.additionOfTwoNumbers());
		System.out.println("Subtraction is " +firstObject.subtractionOfTwoNumbers());
		System.out.println("Multification is " +firstObject.multificationOfTwoNumbers());
		System.out.println("Division is " +firstObject.divisionOfTwoNumbers());
		
		secondObject.setPhoneNumber("8983221653");
		secondObject.setDob(21, 8, 1996);
		secondObject.toString();
		
		
	}
}
