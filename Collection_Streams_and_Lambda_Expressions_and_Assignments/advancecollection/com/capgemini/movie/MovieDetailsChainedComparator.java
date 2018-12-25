package com.capgemini.movie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * For chaining the comparators to sort on the basis of different attributes like movie name, movie genre etc
 * @author tkhandag
 *
 */
public class MovieDetailsChainedComparator implements Comparator<MovieDetails>
{
	private ArrayList<Comparator<MovieDetails>> listComparators = new ArrayList<Comparator<MovieDetails>>();

	/**
	 * here are this comparator takes a list of comparators passed via its constructor;
	 * @param comparators
	 */
	@SafeVarargs
    public MovieDetailsChainedComparator(Comparator<MovieDetails>... comparators) 
	{
        this.listComparators =  (ArrayList<Comparator<MovieDetails>>)Arrays.asList(comparators);
    }
	
	/**
	 * This  method iterates over this comparators list to compare two MovieDetails objects by each individual comparator.
	 */
	@Override
	public int compare(MovieDetails one, MovieDetails two) 
	{
		for (Comparator<MovieDetails> comparator : listComparators) {
            int result = comparator.compare(one, two);
            if (result != 0) {
                return result;
            }
        }
 		return 0;
	}
}
