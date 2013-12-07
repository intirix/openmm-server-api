package com.intirix.openmm.server.api.beans;

import org.simpleframework.xml.Default;

/**
 * Details about a movie
 * @author jeff
 *
 */
@Default
public class MovieDetails
{

	private Movie movie;
	
	private boolean available = false;

	public Movie getMovie()
	{
		return movie;
	}

	public void setMovie( Movie movie )
	{
		this.movie = movie;
	}

	public boolean isAvailable()
	{
		return available;
	}

	public void setAvailable( boolean available )
	{
		this.available = available;
	}
	
	

}
