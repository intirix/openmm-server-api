package com.intirix.openmm.server.api;

import org.simpleframework.xml.Default;

import com.intirix.openmm.server.api.beans.Show;

@Default
public class ShowListResponse
{

	private Show[] shows = new Show[]{};

	public Show[] getShows()
	{
		return shows;
	}

	public void setShows( Show[] shows )
	{
		this.shows = shows;
	}
	
	
}
