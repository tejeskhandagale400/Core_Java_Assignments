package com.capgemini.movie;

import java.util.Comparator;

/**
 *  Comparator class for Movie name to sort the list on the basis of movie genre
 * @author tkhandag
 *
 */
public class MovieGenreComparator  implements Comparator<MovieDetails>
{ 	
	@Override
	public int compare(MovieDetails movie1, MovieDetails movie2) 
	{
		   return movie1.getGenre().compareTo(movie2.getGenre());		//comparing the genre of two different movies
		 
	}

}
