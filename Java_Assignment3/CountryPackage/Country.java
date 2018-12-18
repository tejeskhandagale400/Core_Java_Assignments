/* Define a class Country that stores the name of the country, its population, and its area. Using that class, write a test program that creates a few countries and stores them in an array and then prints

The country with the largest area
The country with the largest population
The country with the largest population density (people per square mile)
*/



package CountryPackage;

import java.util.Arrays;

public class Country
{
	private String countryName;
	private int CountryPopulation;
	private int countryArea;

	public Country(String countryName, int CountryPopulation , int countryArea) 
	{
		this.countryName = countryName;
		this.CountryPopulation = CountryPopulation;
		this.countryArea = countryArea;

	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public int getCountryPulation() {
		return CountryPopulation;
	}

	public void setCountryPulation(int countryPulation) {
		CountryPopulation = CountryPopulation;
	}

	public int getCountryArea() {
		return countryArea;
	}

	public void setCountryArea(int countryArea) {
		this.countryArea = countryArea;
	}

	public Country getCountryWithLargestArea(Country[] countryArray) 
	{

		Country countryWithMaximunArea  =countryArray[0];
		for(int counter= 0 ; counter <countryArray.length ; counter++)
		{
			if(countryArray[counter].countryArea > countryWithMaximunArea.countryArea)
			{
				countryWithMaximunArea = countryArray[counter];
			}

		}
		
		System.out.println("Country :" +countryWithMaximunArea.countryName + " And Largest Area :" +countryWithMaximunArea.countryArea);
			
			return countryWithMaximunArea;
					 
	}

	public Country getCountryWithLargestPopulation(Country[] countryArray) 
	{	
		Country countryWithMaximumPopulation = countryArray[0];
		for(int counter= 0 ; counter <countryArray.length ; counter++)
		{
			if(countryArray[counter].CountryPopulation > countryWithMaximumPopulation.CountryPopulation)
			{
				countryWithMaximumPopulation = countryArray[counter];
			}

		}
		
		System.out.println("Country :" +countryWithMaximumPopulation.countryName + " And Largest Population :" +countryWithMaximumPopulation.CountryPopulation);
		

		return countryWithMaximumPopulation;
	}

	public Country getCountryWithLargestPopulationDensity(Country[] countryArray)
	{
		Country countryWithLargestPopulationDensity = countryArray[0];
		for(int counter= 0 ; counter <countryArray.length ; counter++)
		{
			if((countryArray[counter].CountryPopulation / countryArray[counter].countryArea )> (countryWithLargestPopulationDensity.CountryPopulation / countryWithLargestPopulationDensity.countryArea ))
			{
				countryWithLargestPopulationDensity = countryArray[counter];
			}

		}
		
		System.out.println("Country :" +countryWithLargestPopulationDensity.countryName + " And  Population :" +countryWithLargestPopulationDensity.CountryPopulation);

		return countryWithLargestPopulationDensity;
	}
		
		
	}

	
	

