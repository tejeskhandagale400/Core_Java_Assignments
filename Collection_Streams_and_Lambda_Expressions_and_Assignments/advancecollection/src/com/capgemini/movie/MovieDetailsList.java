package com.capgemini.movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class MovieDetailsList 
{
	private ArrayList<MovieDetails> movieList = new ArrayList();
	 
	public void addMovie(MovieDetails addNeweMovie) 
	{
 		movieList.add(addNeweMovie);
 	}

	public void removeMovie(MovieDetails addNeweMovie) 
	{
		 movieList.remove(addNeweMovie);
		
	}

	@Override
	public String toString() {
		return "MovieDetailsList [movieList=" + movieList + "]";
	}

	public void removeAllMovies() 
	{
		 movieList.removeAll(movieList);
		
	}

	public MovieDetails findMovieByMovieName(String movieName) 
	{
		 for(MovieDetails string : movieList)
		 {
			 if(string.getMovieName().matches(movieName))
			 {
				 System.out.println(string);
				return string;
			 }
			 }
		return null;
	}

	public  MovieDetailsList findMovieByMovieGenre(String genreName) 
	{
		MovieDetailsList temporaryArryList = new MovieDetailsList();
		 for(MovieDetails string : movieList)
		 {
			 if(string.getGenre().matches(genreName))
			 {
				// System.out.println(string);
				 temporaryArryList.addMovie(string);
 			 }
		}
		return temporaryArryList;
	}

	public void sortingList(String string1, String string2)
	{
		 Collections.sort(movieList, new EmployeeChainedComparator(new EmployeeJobTitleComparator(),Set<MovieDetails> movieSet = new TreeSet<MovieDetails> (movieList));
		 
		
	}

	

}
