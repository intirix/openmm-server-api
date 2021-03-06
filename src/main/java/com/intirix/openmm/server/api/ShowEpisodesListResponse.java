package com.intirix.openmm.server.api;

import org.simpleframework.xml.Default;

import com.intirix.openmm.server.api.beans.EpisodeDetails;
import com.intirix.openmm.server.api.beans.Season;
import com.intirix.openmm.server.api.beans.Show;

@Default
public class ShowEpisodesListResponse
{

	private Show show;
	
	private Season season;
	
	private EpisodeDetails[] episodes = new EpisodeDetails[]{};

	public Show getShow()
	{
		return show;
	}

	public void setShow( Show show )
	{
		this.show = show;
	}

	public Season getSeason()
	{
		return season;
	}

	public void setSeason( Season season )
	{
		this.season = season;
	}

	public EpisodeDetails[] getEpisodes()
	{
		return episodes;
	}

	public void setEpisodes( EpisodeDetails[] episodes )
	{
		this.episodes = episodes;
	}
	
	
}
