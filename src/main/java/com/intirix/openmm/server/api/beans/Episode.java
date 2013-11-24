package com.intirix.openmm.server.api.beans;

import java.io.Serializable;

import org.simpleframework.xml.Default;
import org.simpleframework.xml.Element;

@Default
public class Episode implements Serializable, Cloneable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;
	
	private int seasonId;
	
	private String tvdbId = "";
	
	private String name = "";
	
	private int epNum;
	
	private int dvdNum;
	
	@Element(required=false)
	private String screenshotPath = "";
	
	@Element(required=false)
	private String description = "";
	
	@Element(required=false)
	private String guests = "";
	
	@Element(required=false)
	private String airDate = "";
	
	@Element(required=false)
	private String rating = "";
	
	@Element(required=false)
	private String lastWatched = "";
	
	private int watchCount = 0;

	public int getId()
	{
		return id;
	}

	public void setId( int id )
	{
		this.id = id;
	}

	public int getSeasonId()
	{
		return seasonId;
	}

	public void setSeasonId( int seasonId )
	{
		this.seasonId = seasonId;
	}

	public String getTvdbId()
	{
		return tvdbId;
	}

	public void setTvdbId( String tvdbId )
	{
		if ( tvdbId != null )
		{
			this.tvdbId = tvdbId;
		}
	}

	public String getName()
	{
		return name;
	}

	public void setName( String name )
	{
		if ( name != null )
		{
			this.name = name;
		}
	}

	public int getEpNum()
	{
		return epNum;
	}

	public void setEpNum( int epNum )
	{
		this.epNum = epNum;
	}

	public int getDvdNum()
	{
		return dvdNum;
	}

	public void setDvdNum( int dvdNum )
	{
		this.dvdNum = dvdNum;
	}

	public String getScreenshotPath()
	{
		return screenshotPath;
	}

	public void setScreenshotPath( String screenshotPath )
	{
		if ( screenshotPath != null )
		{
			this.screenshotPath = screenshotPath;
		}
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription( String description )
	{
		if ( description != null )
		{
			this.description = description;
		}
	}
	
	

	public String getGuests()
	{
		return guests;
	}

	public void setGuests( String guests )
	{
		if ( guests != null )
		{
			this.guests = guests;
		}
	}

	public String getAirDate()
	{
		return airDate;
	}

	public void setAirDate( String airDate )
	{
		this.airDate = airDate;
	}

	public String getRating()
	{
		return rating;
	}

	public void setRating( String rating )
	{
		if ( rating != null )
		{
			this.rating = rating;
		}
	}

	public String getLastWatched()
	{
		return lastWatched;
	}

	public void setLastWatched( String lastWatched )
	{
		this.lastWatched = lastWatched;
	}

	public int getWatchCount()
	{
		return watchCount;
	}

	public void setWatchCount( int watchCount )
	{
		this.watchCount = watchCount;
	}

	@Override
	public Object clone() throws CloneNotSupportedException
	{
		final Episode episode = new Episode();

		episode.id = id;
		episode.seasonId = seasonId;
		episode.tvdbId = tvdbId;
		episode.name = name;
		episode.epNum = epNum;
		episode.dvdNum = dvdNum;
		episode.screenshotPath = screenshotPath;
		episode.description = description;
		episode.guests = guests;
		episode.airDate = airDate;
		episode.rating = rating;
		episode.lastWatched = lastWatched;
		episode.watchCount = watchCount;
		
		return episode;
	}
	
	
	
	
}
