
/*Define the class named PersonTest  which contains main() method. In the main() method, 2 Person objects are created, their details are displayed and the older one among them is identifed and displayed; as follows below:-

NOTE:-Do not forget to write TestCases for method "olderOne(person)".

Let the Person Object be initialized by values ("Ram", 5, 6, 1980) and ("Shyam", 2, 3, 1987) 

First Person Details: 
Name: Ram
Date of Birth: 5/6/1980
Age: ... Years, ... Months, ... Days //actual values as per current date should be displayed.

Second Person Details: 
Name: Shayam 
Date of Birth: 2/3/1987
Age: ... Years, ... Months, ... Days //actual values as per current date should be displayed.

Ram is older than Shyam by 6 Years, 8 Months, 25 Days*/







package person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class Person
{
	private String personName;
	private Date dob ;
	
	private int day,  month,  year;
	private int days , months,  years;
	private int dayDiff,  monthDiff,  yearDiff;


	public Person(String name, int day, int month, int year)
	{
		this.personName = name;
		this.day=day;
		this.month=month;
		this.year=year;
	}
	SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
	
	
	
	public Date getDob() 
	{
		return dob;
	}

	public void setDob(Date dob)
	{
		this.dob = dob;
	}

	public void display() 
	{	findAge();
		 System.out.println("Name : " +personName);
		 System.out.println("Date Of Birth  : " +day+ "/" +month+ "/" +year);
		 System.out.println("Age :" +years+ " years ," +months+ " months," +days+ " days" );
		  
 	 
			
	}
 

	public void findAge() 				//here the age is calculated on the basis of current date
	{
		LocalDate birthdate = LocalDate.of(this.year, this.month,this.day );
		LocalDate currentDtae = LocalDate.now();
		Period diff = Period.between(birthdate,currentDtae);
		years = diff.getYears();
		months = diff.getMonths();
		days = diff.getDays();
		
		
	
		
	}

	public int[] olderOne(Person personOne) 			//this function gives the person who is older than other 
	{ 
		int[] diffArray =new  int[3]; 
		if(personOne.year< year)
		{
		LocalDate smallerDate = LocalDate.of(personOne.year, personOne.month,personOne.day );
		LocalDate biggerDate = LocalDate.of(this.year, this.month,this.day );
		Period diff = Period.between(smallerDate,biggerDate);
		 System.out.println(  this.personName+ " is older than " +personOne.personName+" by " +diff.getYears()+" years " + diff.getMonths()+ " months " +diff.getDays()+ " days");
	 	diffArray[0] = diff.getYears();
	 	diffArray[1] = diff.getMonths();
	 	diffArray[2] = diff.getDays();
		}
		else
		{
			LocalDate smallerDate = LocalDate.of(this.year, this.month,this.day );
			LocalDate biggerDate = LocalDate.of(personOne.year, personOne.month,personOne.day );
			Period diff = Period.between(smallerDate,biggerDate);
			 System.out.println( personOne.personName + " is older than " +this.personName+" by " +diff.getYears()+" years " + diff.getMonths()+ " months " +diff.getDays()+ " days");
			 	diffArray[0] = diff.getYears();
			 	diffArray[1] = diff.getMonths();
			 	diffArray[2] = diff.getDays();
		}
		return diffArray;
	 
	}
}
	
	

