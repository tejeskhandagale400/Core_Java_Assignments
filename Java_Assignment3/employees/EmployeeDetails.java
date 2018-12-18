/*Attributes:
	Id
	name
	monthlyBasic
Behaviours/Interfaces/Services: 
	getAnnualBasic() //(return 12 * monthlyBasic;)
	getMonthlyGrossSalary()//(monthlyBasic + hra + medical + conveyance)
	getAnnualGrossSalary() //(12 * MonthlyGrossSalary)
	getMonthlyDeductions() //(pf + esic + profTax)
	getMonthlyTakeHome() //(MonthlyGrossSalary- MonthlyDeductions)
	getAnnualTakeHome() //(12 * MonthlyTakeHome)
	setPFRate(float f)  and getPFRate()


HRA = 50% of basic, medical allowance = Rs 1250, conveyance allowance = Rs 800
PF = 10% of  monthly basic or 6500 whichever is lower.
ESIC = 4.75% of monthly basic if monthly basic <= 5000
professional tax: if monthly gross <= 10000 then Rs 50, else Rs 100 */










package employees;



public class EmployeeDetails 
{
	EmployeeDetails(int id)
	{
		this.id=id;
	}
	
	 private final int id;
	 private String name;
	 private double monthlyBasic;
	 private static float pfRate=10;
	 private static	double medicalAllowance = 1250, conveyanceAllowance = 800;
	 private static double monthlyGrossSalary ,monthlyDeductions ,monthlyTakeHome;
	 public int getId()
	 {
		 System.out.println("Id is bvc: "+id);
		return id;
	 }
	 
//	 public void setId(int id)
//	{
//		this.id = id;
//	}
	
	public String getName()
	{
		System.out.println("Name Of employee is: "+ name);
		return name;
	}
	
	public void setName(String name) 
	{
		
		this.name = name;
		
	}
	
	public double getMonthlyBasic()
	{
		 System.out.println("monthly Basic is: " +monthlyBasic);
		return monthlyBasic;
	}
	
	public void setMonthlyBasic(double monthlyBasic) 
	{
		if(monthlyBasic>0)
		{	this.monthlyBasic = monthlyBasic;}
		else
		{	this.monthlyBasic = 0;}

	}

	public double getAnnualBasic() {
		System.out.println(" Annual Income : "   +monthlyBasic*12);
		return monthlyBasic*12;
		// TODO Auto-generated method stub
		
	}

	public double getMonthlyGrossSalary()
	{
		double hra = ( monthlyBasic * 50 )/100;
		 monthlyGrossSalary = monthlyBasic + hra + medicalAllowance + conveyanceAllowance;
		System.out.println("Monthly Gross Salary is :" +monthlyGrossSalary);
		return monthlyGrossSalary;

		
	}

	public double getAnnualGrossSalary()
	{
		double annualGrossSalary = getMonthlyGrossSalary() *12;
		System.out.println("Annual Gross salary : "+annualGrossSalary);
		return annualGrossSalary;
	
		
	}

	public double getMonthlyDeductions() {
		double pf,esic,professionalTax ;
		
		pf = (((monthlyBasic * pfRate)/100 )<6500 ) ? ((monthlyBasic * pfRate)/100) : 6500 ;
		esic = (monthlyBasic<=5000) ? ((monthlyBasic * 4.75)/100) : 0;
		professionalTax = ((getMonthlyGrossSalary())<=10000) ? 50 : 100 ;
		monthlyDeductions = pf + esic + professionalTax;
		System.out.println("Monthly Deduction : "+monthlyDeductions);
		return monthlyDeductions;

		
	}

	public double getMonthlyTakeHome() {
		monthlyTakeHome = getMonthlyGrossSalary() - getMonthlyDeductions();
		System.out.println("Monthly Take home : "+monthlyTakeHome);

		return monthlyTakeHome;
		// TODO Auto-generated method stub
		
	}

	public double getAnnualTakeHome() {
		double annualTakeHome;
		annualTakeHome = getMonthlyTakeHome() * 12;
		System.out.println("Annual Take Home : "+annualTakeHome);
		return annualTakeHome;

		
	}

	public void setPfRate(float pfRate) {
		this.pfRate=pfRate;
		
	}

	public float getPfRate() {
		System.out.println("Pf rate : "+pfRate);
		return pfRate;
		// TODO Auto-generated method stub
		
	}

 
}
