package IntermediateInheritance;

/**
 * Junit Test for public and corporate training
 */
import static org.junit.Assert.*;

import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

import org.apache.log4j.Logger;
import org.junit.Test;

public class TrainingTest {

	private Logger logger = Logger.getLogger(Training.class.getName());
	
	
	/**
	 * test For Public Training Get Order Value With Upcasting
	 */
	@Test
	public void testForPublicTrainingGetOrderValueWithUpcasting() 
	{
		logger.debug("test start");
		Training publicTraining = new PublicTraining("Java" ,5000,50);
 		assertEquals(250000,publicTraining.getOrderValue(),0);
	}

	/**
	 * test For Corporate Training Get Order Value With Upcasting
	 */
	@Test
	public void testForCorporateTrainingGetOrderValueWithUpcasting() 
	{
	 
		Training corporateTraining = new Corporate("Big Data" ,35000,4);
 		assertEquals(140000,corporateTraining.getOrderValue(),0);
	}
	
	/**
	 * test For Public Training Get Order Value Without Upcasting
	 */
	@Test
	public void testForPublicTrainingGetOrderValueWithoutUpcasting() 
	{
	 
		PublicTraining publicTraining = new PublicTraining("Java" ,5000,50);
 		assertEquals(250000,publicTraining.getOrderValue(),0);
	}

	/**
	 * test For Corporate Training Get Order Value Without Upcasting
	 */
	@Test
	public void testForCorporateTrainingGetOrderValueWithoutUpcasting() 
	{
	 
		Corporate corporateTraining = new Corporate("Big Data" ,35000,4);
 		assertEquals(140000,corporateTraining.getOrderValue(),0);
	}
}
