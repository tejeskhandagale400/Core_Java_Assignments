package com.capgemini.movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
/**
 * Movie_DetailsList class should have method add_movie(), remove_movie(), remove_AllMovies(), find_movie_By_mov_Name(), find_movie_By_Genre()
 * @author tkhandag
 *
 */
public class MovieDetailsList 
{
	private ArrayList<MovieDetails> movieList = new ArrayList();
	 
	/**
	 * To add a new movie into the list
	 * @param addNeweMovie
	 */
	public void addMovie(MovieDetails addNeweMovie) 
	{
 		movieList.add(addNeweMovie);
 	}

	/**
	 *  To remove movie from  the list
	 * @param addNeweMovie
	 */
	public void removeMovie(MovieDetails addNeweMovie) 
	{
		 movieList.remove(addNeweMovie);
		
	}

	/**
	 * To get the List of movies exist in the object
	 * @return
	 */
	public ArrayList<MovieDetails> getMovieList() {
		return movieList;
	}

	/**
	 * To displya the list
	 */
	@Override
	public String toString() {
		return "MovieDetailsList [movieList=" + movieList + "]";
	}

	/**
	 * To remove the all movies exixst in the list 
	 */
	public void removeAllMovies() 
	{
		 movieList.removeAll(movieList);
		
	}

	/**
	 * To Get the the movie details by searching by passing movie name
	 * @param movieName
	 * @return
	 */
	public MovieDetails findMovieByMovieName(String movieName) 
	{
		 for(MovieDetails string : movieList)
		 {
			 if(string.getMovieName().matches(movieName))
			 {
				 //System.out.println(string);
				return string;
			 }
			 }
		return null;
	}

	/**
	 * To Get the the movie details by searching by passing movie Genre
	 * @param genreName
	 * @return
	 */
	public  MovieDetailsList findMovieByMovieGenre(String genreName) 
	{
		MovieDetailsList temporaryArryList = new MovieDetailsList();
		 for(MovieDetails string : movieList)
		 {
			 if(string.getGenre().matches(genreName))
			 {
				System.out.println(string);
				 temporaryArryList.addMovie(string);
 			 }
		}
		return temporaryArryList;
	}

	/**
	 * Sorting the movie list on the basis of passing argument 
	 * @param argument
	 */
	public void sortingList(String argument)
	{
		switch (argument)
		{
		case "ByMovieName":
//			Collections.sort(movieList,  new MovieNameComparator());   	//It will Sort the list on the basis of movie name
			System.out.println(movieList);
			break;
		
		case "ByMovieGenre":
			Collections.sort(movieList,  new MovieGenreComparator()); //It will Sort the list on the basis of movie Genre
			System.out.println(movieList);
			break;

		case "ByActorName":
			Collections.sort(movieList,  new MovieActorComparator()); 	//It will Sort the list on the basis of Lead actor name
			System.out.println(movieList);
			break;

		case "ByActreesName":
			Collections.sort(movieList,  new MovieActressComparator());  	//It will Sort the list on the basis of Lead actress name	
			System.out.println(movieList);
			break;
		
		}
		
		
	}
	
	/**
	 * To get the number of elements or number of movies present in the list
	 * @return
	 */
	public int getNumberOfMovieInList()
	{
		return movieList.size();
	
	}

	

}
