package CountryPackage;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class TestMainFOrCountry 
{

	@Test
	public void main()
	{
		Country [] countryArray = new Country[5];
		countryArray[0] = new Country("India" , 1189172906, 1269338000);
		countryArray[1] = new Country("China" , 1336718015, 3705386);
		countryArray[2] = new Country("Australia" ,21766711, 29678993);
		countryArray[3] = new Country("Bangladesh" , 158570535, 55598);
		countryArray[4] = new Country("Canada" , 34030589, 3855088);


		Country countryWithMaximunArea = countryArray[0].getCountryWithLargestArea(countryArray);
		Country countryWithMaximumPopulation = countryArray[0].getCountryWithLargestPopulation(countryArray);
		Country countryWithLargestPopulationDensity = countryArray[0].getCountryWithLargestPopulationDensity(countryArray);
		
		
	}

}
