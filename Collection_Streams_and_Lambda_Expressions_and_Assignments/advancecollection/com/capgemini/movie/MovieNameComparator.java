package com.capgemini.movie;

import java.util.Comparator;

/**
 * Comparator class for Movie name to sort the list on the basis of movie name
 * @author tkhandag
 *
 */
public class MovieNameComparator implements Comparator<MovieDetails> 
{
	  
	     @Override
	     public int compare(MovieDetails movie1, MovieDetails movie2) 
	     {
	         return movie1.getMovieName().compareTo(movie2.getMovieName());		//comparing the names of two different movies
	     }

}
