package com.intirix.openmm.server.api;

import org.simpleframework.xml.Default;

import com.intirix.openmm.server.api.beans.MovieDetails;

@Default
public class MovieListResponse
{

	private MovieDetails[] movies = new MovieDetails[]{};

	public MovieDetails[] getMovies()
	{
		return movies;
	}

	public void setMovies( MovieDetails[] movies )
	{
		this.movies = movies;
	}
	
	

}
