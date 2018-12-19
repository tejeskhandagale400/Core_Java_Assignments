package IntermediateInheritance;
/**
 * subclass of Training class
 * @author tejas
 *
 */
public class Corporate extends Training {
	
	private int days;
	
	/**
	 * Argument constructor to initiate class instance  members
	 * @param courseName
	 * @param fees
	 * @param days
	 */
	public Corporate(String courseName, double fees, int days) {
		 super(courseName, fees);
		 this.days = days;
	}

	/**
	 * to display data
	 */
	@Override
	public String toString() {
		return "Corporate [days=" + days + ", Subject=" + getSubject()
				+ ", Fees=" + getFees() + ", CourseId="
				+ getCourseId() + "]";
	}

	/**
	 * Implementation of abstract method for subclass corporate to return the order value
	 */
	@Override
	public double getOrderValue() {
 		return  super.getFees() * this.days;
	}

}
