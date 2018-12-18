
import java.util.*;
class ResultDec {
	
		public static String result(int subject1,int subject2,int subject3)
		{
				if(subject1>60 && subject2>60 && subject3>60)
				{
					return "Passed";
				}
				
				if((subject1>60 && subject2>60 && subject3<60) ||(subject2>60 && subject3>60  && subject1<60) || (subject1>60 && subject3>60  && subject2<60))
				{
					return "Promoted";
				
				}
				
				if((subject1<60 && subject2<60 && subject3>60) ||(subject2<60 && subject3<60  && subject1>60) || (subject1<60 && subject3<60  && subject2>60) || (subject1<60 && subject3<60  && subject2<60))
				{
					return "Failled";
				}
					
				return "null";
		}
		
		public static void main(String[] args)
		{
			Scanner input=new Scanner(System.in);
			System.out.println("Enter marks");
			int subject1=input.nextInt();
			int subject2=input.nextInt();
			int subject3=input.nextInt();
			String output=result(subject1,subject2,subject3);
			System.out.println(output);
			
		}

}
