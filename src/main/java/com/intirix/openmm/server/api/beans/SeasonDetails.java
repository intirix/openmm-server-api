package com.intirix.openmm.server.api.beans;

import org.simpleframework.xml.Default;

/**
 * Bean that stores the Season object, as well as the number of episodes that are available
 * in each season
 * @author jeff
 *
 */
@Default
public class SeasonDetails
{

	private Season season;
	
	private int numEpisodes = 0;
	
	private int numEpisodesAvailable = 0;

	public Season getSeason()
	{
		return season;
	}

	public void setSeason( Season season )
	{
		this.season = season;
	}

	public int getNumEpisodes()
	{
		return numEpisodes;
	}

	public void setNumEpisodes( int numEpisodes )
	{
		this.numEpisodes = numEpisodes;
	}

	public int getNumEpisodesAvailable()
	{
		return numEpisodesAvailable;
	}

	public void setNumEpisodesAvailable( int numEpisodesAvailable )
	{
		this.numEpisodesAvailable = numEpisodesAvailable;
	}
	
	
}
