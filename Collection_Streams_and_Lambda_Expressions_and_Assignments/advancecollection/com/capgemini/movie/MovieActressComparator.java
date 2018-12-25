package com.capgemini.movie;

import java.util.Comparator;

/**
 * Comparator class for Movie name to sort the list on the basis of Actress name
 * @author tkhandag
 *
 */
public class MovieActressComparator implements Comparator<MovieDetails>
{ 	
	@Override
	public int compare(MovieDetails movie1, MovieDetails movie2) 
	{
		   return movie1.getLeadActress().compareTo(movie2.getLeadActress());
		 
	}
}
