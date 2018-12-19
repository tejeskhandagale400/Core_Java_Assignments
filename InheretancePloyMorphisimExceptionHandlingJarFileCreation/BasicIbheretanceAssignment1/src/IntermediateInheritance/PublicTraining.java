package IntermediateInheritance;
/**
 * subclass of training class
 * @author tejas
 *
 */
public class PublicTraining extends Training {
	
	private int participents ;
	
	/**
	 * argument constructor to initialize class instance members
	 * @param subject
	 * @param fees
	 * @param participents
	 */
	 PublicTraining(String subject, double fees, int participents)
	{
		
		super(subject, fees);
		this.participents = participents;
		 	 
	}
	
	 /**
	  * to display the data
	  */
	@Override
	public String toString() {
		return "PublicTraining [participents=" + participents
				+ ", Subject=" + super.getSubject() + ", Fees=" + super.getFees()
				+ ", CourseId=" + super.getCourseId() + "]";
	}


	/**
	 * Implementation for abstract method for subclass public training to return order value 
	 */
	@Override
	public double getOrderValue() {
		return (super.getFees()*participents);

	}
	
	 
	
	 
 

	 
}
