package com.capgemini.movie;

import java.util.Comparator;

/**
 * Comparator class for Movie name to sort the list on the basis of Actor name
 * @author tkhandag
 *
 */
public class MovieActorComparator  implements Comparator<MovieDetails>
{ 	
	@Override
	public int compare(MovieDetails movie1, MovieDetails movie2) 
	{
		   return movie1.getLeadActor().compareTo(movie2.getLeadActor());
		 
	}

}
