import java.util.*;
class Student
{

	public static void main(String [] args)
	{
		
		Scanner input=new Scanner(System.in);

		System.out.println("Enter marks for student1");
		int student1SubjectOne=input.nextInt();
		int student1SubjectTwo=input.nextInt();
		int student1SubjectThree=input.nextInt();
		
		
		System.out.println("Enter marks for student2");
		int student2SubjectOne=input.nextInt();
		int student2SubjectTwo=input.nextInt();
		int student2SubjectThree=input.nextInt();
		
		System.out.println("Enter marks for student3");
		int student3SubjectOne=input.nextInt();
		int student3SubjectTwo=input.nextInt();
		int student3SubjectThree=input.nextInt();
		
		int totalOfStudent1=total(student1SubjectOne,student1SubjectTwo,student1SubjectThree);
		System.out.println("Total Marks of Student 1 =" +totalOfStudent1);
		
		int totalOfStudent2=total(student2SubjectOne,student2SubjectTwo,student2SubjectThree);
		System.out.println("Total Marks of Student 2 =" +totalOfStudent2);
		
		
		int totalOfStudent3=total(student3SubjectOne,student3SubjectTwo,student3SubjectThree);
		System.out.println("Total Marks of Student 3 =" +totalOfStudent3);
		

		System.out.println();
		
	
		int totalOfSubject1=total(student1SubjectOne,student2SubjectOne,student3SubjectOne);
		System.out.println("Total Marks of subject 1 =" +totalOfSubject1);
		
		int totalOfSubject2=total(student1SubjectTwo,student2SubjectTwo,student3SubjectTwo);
		System.out.println("Total Marks of subject 2 =" +totalOfSubject2);
		
		
		int totalOfSubject3=total(student1SubjectThree,student2SubjectThree,student3SubjectThree);
		System.out.println("Total Marks of subject 3 =" +totalOfSubject3);
		
		System.out.println();

		int averageOfStudent1=totalOfStudent1/3;
		System.out.println("Average Marks of Student 1 =" +averageOfStudent1);
		
		
		int averageOfStudent2= totalOfStudent2/3;
		System.out.println("Average Marks of Student 2 =" +averageOfStudent2);
		
		
		int averageOfStudent3= totalOfSubject1/3;
		System.out.println("Average Marks of Student 3 =" +averageOfStudent3);
		
		System.out.println();

		int averageSubjectOne=totalOfSubject2/3;
		System.out.println("Average Marks of subject 1 =" +averageSubjectOne);
		
		
		int averageOfSubjectTwo=totalOfSubject3/3;
		System.out.println("Average Marks of subject 2 =" +averageOfSubjectTwo);
		
		
		int averageOfSubjectThree=totalOfStudent3/3;
		System.out.println("Average Marks of subject 3 =" +averageOfSubjectThree);
		
		
		

		


	}

	
	public static int total(int numberOne,int numberTwo,int numberThree)
	{
			
		int addition= numberOne + numberTwo + numberThree;
		return addition;
		
		
	}



}