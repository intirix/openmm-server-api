package com.intirix.openmm.server.api.beans;

import org.simpleframework.xml.Default;

@Default
public class EpisodeDetails
{

	private Episode episode;
	
	private int numInternalLinks = 0;
	
	private int numExternalLinks = 0;
	
	private MediaLink[] links = new MediaLink[]{};

	public Episode getEpisode()
	{
		return episode;
	}

	public void setEpisode( Episode episode )
	{
		this.episode = episode;
	}

	public int getNumInternalLinks()
	{
		return numInternalLinks;
	}

	public void setNumInternalLinks( int numInternalLinks )
	{
		this.numInternalLinks = numInternalLinks;
	}

	public int getNumExternalLinks()
	{
		return numExternalLinks;
	}

	public void setNumExternalLinks( int numExternalLinks )
	{
		this.numExternalLinks = numExternalLinks;
	}

	public MediaLink[] getLinks()
	{
		return links;
	}

	public void setLinks( MediaLink[] links )
	{
		this.links = links;
	}


	
	
}
