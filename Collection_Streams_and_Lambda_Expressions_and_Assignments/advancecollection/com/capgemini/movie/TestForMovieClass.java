package com.capgemini.movie;

import static org.junit.Assert.*;

import java.util.ArrayList;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import org.junit.Before;
import org.junit.Test;

/**
 * Test For the Different Methods of MovieDetailstList Class 
 * @author tkhandag
 *
 */
public class TestForMovieClass 
{
	
	/**
	 * Initializing the MovieDetails objects to store in the list
	 */
	private MovieDetailsList movieDetailsList = new MovieDetailsList();
	private MovieDetails movieOne = new MovieDetails("Padman", "Amir Khan" , "Kareena Kapoor","Comedy");
	private MovieDetails movieTwo = new MovieDetails("Kuch kuch hota hai", "Shar Rukh Khan" , "Rani Mukharji","Romantic");
	private MovieDetails movieThree = new MovieDetails("Brothers", "Akshay kumar" , "Kareena Kapoor","Action");
	private MovieDetails movieFour = new MovieDetails("Vivah", "Shahid Kapoor" , "Amruta Rao","Romantic");

	/**
	 * Set up For Below tests i.e. ading the movies in the list
	 */
	@Before
	public void setup() 
	{
		movieDetailsList.addMovie(movieOne);
		movieDetailsList.addMovie(movieTwo);
		movieDetailsList.addMovie(movieThree);
		movieDetailsList.addMovie(movieFour);
 		//movieDetailsList.removeMovie(movieTwo);
		//movieDetailsList.removeAllMovies();
		//MovieDetails recievedMovieOne = movieDetailsList.findMovieByMovieName("Brothers");
 		//System.out.println(movieDetailsList);
		/*MovieDetailsList temporaryArryList = new MovieDetailsList();  
		temporaryArryList = movieDetailsList.findMovieByMovieGenre("Romantic");
 		System.out.println(temporaryArryList);*/
 		//movieDetailsList.sortingList("ByMovieGenre");
	}
	
	/**
	 * test For Add Movie in the list
	 */
	@Test
	public void testForAddMovie() 
	{
		MovieDetails movieFive = new MovieDetails("3Idiot", "Amir Khan" , "Kareena Kapoor","Comedy");
		movieDetailsList.addMovie(movieFive);
		assertEquals(5 ,movieDetailsList.getNumberOfMovieInList());
	}
	
	/**
	 * Test For Remove Movie from the list
	 */
	@Test
	public void testForRemoveMovie() 
	{
		MovieDetails movieFive = new MovieDetails("3Idiot", "Amir Khan" , "Kareena Kapoor","Comedy");
		movieDetailsList.removeMovie((movieFive));
		assertEquals(4 ,movieDetailsList.getNumberOfMovieInList());			//By removing the movie it will decrease the number of movies

	}
	
	/**
	 * Test To remove all the movies from the list 
	 */
	/*@Test
	public void testForRemoveAllMovies() 
	{
 		movieDetailsList.removeAllMovies();
		assertEquals(0 ,movieDetailsList.getNumberOfMovieInList());		//When we remove all the moves from the list the number of elements in the list goes to 0

	}*/
	
	/**
	 * Test For Find Movie By Passing the argument movieName
	 */
	@Test
	public void testForFindMovieByName() 
	{
		MovieDetails temporaryArryList = null;  
		temporaryArryList = movieDetailsList.findMovieByMovieName("Padman");
  		MovieDetails expected = new MovieDetails("Padman", "Amir Khan" , "Kareena Kapoor","Comedy");
  		assertEquals(expected.toString() ,temporaryArryList.toString());
	}
	
	/**
	 * Test For Find Movie By Passing the argument movie Genre
	 */
	@Test
	public void testForFindMovieByGenre() 
	{
		MovieDetails movieTwo = new MovieDetails("Kuch kuch hota hai", "Shar Rukh Khan" , "Rani Mukharji","Romantic");
		MovieDetails movieFour = new MovieDetails("Vivah", "Shahid Kapoor" , "Amruta Rao","Romantic");
		MovieDetailsList temporaryArryList = new MovieDetailsList();  
		temporaryArryList = movieDetailsList.findMovieByMovieGenre("Romantic");
 		System.out.println(temporaryArryList);
		MovieDetailsList expected = new MovieDetailsList();  
		expected.addMovie(movieTwo);
		expected.addMovie(movieFour);
  		assertEquals(expected.toString() ,temporaryArryList.toString());
	}
	
	/**
	 * Test For Sorting List By Movie Name 
	 */
	@Test
	public void testForSortingListByMovieName() 
	{
		MovieDetailsList expected = new MovieDetailsList();  
 		movieDetailsList.sortingList("ByMovieName");
 		 expected.addMovie(movieThree); 
 		 expected.addMovie(movieTwo); 
 		 expected.addMovie(movieOne); 
 		 expected.addMovie(movieFour); 
 		 assertEquals(expected.toString(),movieDetailsList.toString());
	}
	
	/**
	 * Test For Sorting List By Movie Genre
	 */
	@Test
	public void testForSortingListByMovieGenre() 
	{
		MovieDetailsList expected = new MovieDetailsList();  
 		movieDetailsList.sortingList("ByMovieGenre");
 		 expected.addMovie(movieThree); 
 		 expected.addMovie(movieOne); 
 		 expected.addMovie(movieTwo); 
 		 expected.addMovie(movieFour); 
 		 System.out.println(movieDetailsList);
 		 assertEquals(expected.toString(),movieDetailsList.toString());
	}
}
