package com.capgemini.movie;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestForMovieClass {

	@Test
	public void test() 
	{
 		//ArrayList<MovieDetails> movieList = new ArrayList<MovieDetails>();
		/*movieList.add(new MovieDetails("3Idiot", "Amir Khan" , "Kareena Kapoor","Comedy"));
		movieList.add(new MovieDetails("Harry Potter", "Harry" , "Harmaini","Adventure"));
		movieList.add(new MovieDetails("Vivah", "Shahid Kapoor" , "Amruta Rao","Romantic"));
		movieList.add(new MovieDetails("Kuch kuch hota hai", "Shar Rukh Khan" , "Rani Mukharji","Romantic"));
		movieList.add(new MovieDetails("Brothers", "Akshay kumar" , "Kareena Kapoor","Action"));*/
		MovieDetails movieOne = new MovieDetails("Padman", "Amir Khan" , "Kareena Kapoor","Comedy");
		MovieDetails movieTwo = new MovieDetails("Kuch kuch hota hai", "Shar Rukh Khan" , "Rani Mukharji","Romantic");
		MovieDetails movieThree = new MovieDetails("Brothers", "Akshay kumar" , "Kareena Kapoor","Action");
		MovieDetails movieFour = new MovieDetails("Vivah", "Shahid Kapoor" , "Amruta Rao","Romantic");
		MovieDetails movieFive = new MovieDetails("3Idiot", "Amir Khan" , "Kareena Kapoor","Comedy");
		
		MovieDetailsList movieDetailsList = new MovieDetailsList();
		movieDetailsList.addMovie(movieOne);
		movieDetailsList.addMovie(movieTwo);
		movieDetailsList.addMovie(movieThree);
		movieDetailsList.addMovie(movieFour);
		movieDetailsList.addMovie(movieFive);
		//movieDetailsList.removeMovie(movieTwo);
		//movieDetailsList.removeAllMovies();
		//MovieDetails recievedMovieOne = movieDetailsList.findMovieByMovieName("Brothers");
 		//System.out.println(movieDetailsList);
		MovieDetailsList temporaryArryList = new MovieDetailsList();  
		temporaryArryList = movieDetailsList.findMovieByMovieGenre("Romantic");
 		System.out.println(temporaryArryList);
 		movieDetailsList.sortingList("movieName" , "Ascending");
 		movieDetailsList.sortingList("genreName" , "Ascending");

	}

}
