package com.intirix.openmm.server.api;

import org.simpleframework.xml.Default;

import com.intirix.openmm.server.api.beans.Movie;

@Default
public class MovieDetailsResponse
{

	private Movie movie;

	public Movie getMovie()
	{
		return movie;
	}

	public void setMovie( Movie movie )
	{
		this.movie = movie;
	}
	
	
}
