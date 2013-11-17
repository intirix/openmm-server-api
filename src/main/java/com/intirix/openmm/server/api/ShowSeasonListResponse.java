package com.intirix.openmm.server.api;

import org.simpleframework.xml.Default;

import com.intirix.openmm.server.api.beans.SeasonDetails;
import com.intirix.openmm.server.api.beans.Show;

@Default
public class ShowSeasonListResponse
{

	private Show show;
	
	private SeasonDetails[] seasons = new SeasonDetails[]{};

	public Show getShow()
	{
		return show;
	}

	public void setShow( Show show )
	{
		this.show = show;
	}

	public SeasonDetails[] getSeasons()
	{
		return seasons;
	}

	public void setSeasons( SeasonDetails[] seasons )
	{
		this.seasons = seasons;
	}
	
	
}
