package com.capgemini.movie;

import java.awt.List;
import java.util.Arrays;
import java.util.Comparator;

public class MovieDetails implements Comparator<MovieDetails>
{
	private String movieName;
	private String leadActor;
	private String leadActress;
	private String genre; 
	
	private List<Comparator<MovieDetails>> listComparators;
	
	public MovieDetails(String movieName, String leadActor, String leadActress,	String genre) 
	{
		this.movieName = movieName;
		this.leadActor =  leadActor;
		this.leadActress = leadActress;
		this.genre = genre; 
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	@Override
	public String toString() {
		return "MovieDetails [movieName=" + movieName + ", leadActor="
				+ leadActor + ", leadActress=" + leadActress + ", genre="
				+ genre + "]";
	}

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

	public String getLeadActress() {
		return leadActress;
	}

	public void setLeadActress(String leadActress) {
		this.leadActress = leadActress;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@SafeVarargs
    public MovieDetails(Comparator<MovieDetails>... comparators) {
        this.listComparators = Arrays.asList(comparators);
    }
	
	@Override
	public int compare(MovieDetails arg0, MovieDetails arg1) {
		// TODO Auto-generated method stub
		return 0;
	}

}
