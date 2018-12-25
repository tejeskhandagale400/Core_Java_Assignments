/**
 * Create class Movie_Details with field’s mov_Name, lead_actor, lead_actress, and genre  add setter and getter method in that class. 
a.	After creating this class create class Movie_DetailsList class who will maintain all the objects.
b.	Movie_DetailsList class should have method add_movie(), remove_movie(), remove_AllMovies(), find_movie_By_mov_Name(), find_movie_By_Genre()
c.	Movie_DetailsList should have method which will take an argument that will be use to determine on which to sort 

 */




package com.capgemini.movie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
/**
 * Movie_Details with field’s movie_Name, lead_actor, lead_actress, and genre  add setter and getter method in that class. 
 * @author tkhandag
 *
 */
public class MovieDetails implements Comparable<MovieDetails> 
{
	private String movieName;
	private String leadActor;
	private String leadActress;
	private String genre; 
	private ArrayList<Comparator<MovieDetails>> listComparators = new ArrayList<Comparator<MovieDetails>>();
	
	/**
	 * Parameterized constructor
	 * @param movieName
	 * @param leadActor
	 * @param leadActress
	 * @param genre
	 */
	public MovieDetails(String movieName, String leadActor, String leadActress,	String genre) 
	{
		this.movieName = movieName;
		this.leadActor =  leadActor;
		this.leadActress = leadActress;
		this.genre = genre; 
	}

	/**
	 * To get the name of movie
	 * @return
	 */
	public String getMovieName() {
		return movieName;
	}
	/**
	 * To set the movie name
	 * @param movieName
	 */
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	@Override
	public String toString() {
		return "MovieDetails [movieName=" + movieName + ", leadActor="
				+ leadActor + ", leadActress=" + leadActress + ", genre="
				+ genre + "]";
	}

	/**
	 * To get the name of lead actor
	 * @return
	 */
	public String getLeadActor() {
		return leadActor;
	}

	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result
				+ ((movieName == null) ? 0 : movieName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovieDetails other = (MovieDetails) obj;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (movieName == null) {
			if (other.movieName != null)
				return false;
		} else if (!movieName.equals(other.movieName))
			return false;
		return true;
	}

	/**
	 * To get the name of lead actress
	 * @return
	 */
	public String getLeadActress() {
		return leadActress;
	}

	/**
	 * To set the name of lead actress
	 * @param leadActress
	 */
	public void setLeadActress(String leadActress) {
		this.leadActress = leadActress;
	}

	/**
	 * To get the the genre name 
	 * @return
	 */
	public String getGenre() {
		return genre;
	}

	/**
	 * To set the genre for a movies
	 * @param genre
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}

	/**
	 * To get the list sorted on the basis of name
	 */
	@Override
	public int compareTo(MovieDetails arg0) {
		return this.getMovieName().compareTo(arg0.getMovieName());
		
	}
	
 

}
