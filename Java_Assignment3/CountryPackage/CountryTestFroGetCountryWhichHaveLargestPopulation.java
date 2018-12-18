package CountryPackage;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CountryTestFroGetCountryWhichHaveLargestPopulation {

	private Country [] countryArray = new Country[5];

	@Before
	public void setUp()
	{
		countryArray[0] = new Country("India" , 1189172906, 1269338000);
		countryArray[1] = new Country("China" , 1336718015, 3705386);
		countryArray[2] = new Country("Australia" ,21766711, 29678993);
		countryArray[3] = new Country("Bangladesh" , 158570535, 55598);
		countryArray[4] = new Country("Canada" , 34030589, 3855088);

	}
	
	
	@Test
	public void testToCheckgetCountryWhichHaveLargestPopulation()
	{
		
		Country countryWithMaximunPopulation= countryArray[0].getCountryWithLargestPopulation(countryArray);
		assertEquals(1336718015 , countryWithMaximunPopulation.getCountryPulation());
		
	}
	
	@Test
	public void testToCheckgetCountryWithLargestPopulationOfNameOfThatCountry()
	{
		Country countryWithMaximunPopulation = countryArray[0].getCountryWithLargestPopulation(countryArray);
		assertEquals("China" , countryWithMaximunPopulation.getCountryName());
		
	}

}
