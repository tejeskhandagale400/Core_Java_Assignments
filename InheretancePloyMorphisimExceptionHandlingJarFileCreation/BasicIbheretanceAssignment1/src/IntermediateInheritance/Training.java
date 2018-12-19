package IntermediateInheritance;

/**
 * Super class for subclass public training and corporate training
 * @author Tejas
 *
 */
 abstract class Training {
	
	private String subject;
	private double fees;
	private int id;
	private static int idIncrementor;

	/**
	 * static id initializer for course id to get unique id to each object
	 */
	static 
	{
		idIncrementor=100;
	}
	{
		idIncrementor++;
	}
	
	/**
	 * argument constructor to initialize class instance members
	 * @param subject
	 * @param fees
	 */
	public Training(String subject, double fees) 
	{
		 this.id = idIncrementor;
		 this.subject = subject;
		 this.fees = fees;
		 
	}
	
	/**
	 * 
	 * @return Subject
	 */
	public String getSubject() {
		return subject;
	}
	
	/**
	 * to set subject
	 * @param subject
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public int getCourseId() {
		return id;
	}
	 
	/**
	 * abstract method for get Order Value
	 * @return
	 */
	abstract public double getOrderValue();

}
