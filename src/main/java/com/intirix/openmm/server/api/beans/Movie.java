package com.intirix.openmm.server.api.beans;

import org.simpleframework.xml.Default;
import org.simpleframework.xml.Element;

@Default
public class Movie implements Comparable< Movie >, Cloneable
{
	private int id;

	private String name;

	private String displayName;

	@Element(required=false)
	private String imdbId;

	@Element(required=false)
	private String rtId;

	@Element(required=false)
	private String year = "";

	@Element(required=false)
	private String releaseDate = "";

	@Element(required=false)
	private String description = "";

	@Element(required=false)
	private String posterUrl = "";

	@Element(required=false)
	private String runtime = "";

	@Element(required=false)
	private String mpaaRating = "";

	@Element(required=false)
	private String rating = "";

	@Element(required=false)
	private String genre = "";

//	@Element(required=false)
	private MediaLink[] trailers = new MediaLink[]{};

//	@Element(required=false)
	private MediaLink[] links = new MediaLink[]{};

	public int getId()
	{
		return id;
	}

	public void setId( int id )
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName( String name )
	{
		this.name = name;
	}

	public String getDisplayName()
	{
		return displayName;
	}

	public void setDisplayName( String displayName )
	{
		this.displayName = displayName;
	}



	public String getImdbId()
	{
		return imdbId;
	}

	public void setImdbId( String imdbId )
	{
		this.imdbId = imdbId;
	}

	public String getRtId()
	{
		return rtId;
	}

	public void setRtId( String rtId )
	{
		this.rtId = rtId;
	}

	public String getYear()
	{
		return year;
	}

	public void setYear( String year )
	{
		if ( year != null )
		{
			this.year = year;
		}
	}

	public String getReleaseDate()
	{
		return releaseDate;
	}

	public void setReleaseDate( String releaseDate )
	{
		if ( releaseDate != null )
		{
			this.releaseDate = releaseDate;
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

	public String getPosterUrl()
	{
		return posterUrl;
	}

	public void setPosterUrl( String posterUrl )
	{
		if ( posterUrl != null )
		{
			this.posterUrl = posterUrl;
		}
	}

	public String getRuntime()
	{
		return runtime;
	}

	public void setRuntime( String runtime )
	{
		if ( runtime != null )
		{
			this.runtime = runtime;
		}
	}

	public String getMpaaRating()
	{
		return mpaaRating;
	}

	public void setMpaaRating( String mpaaRating )
	{
		if ( mpaaRating != null )
		{
			this.mpaaRating = mpaaRating;
		}
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

	public String getGenre()
	{
		return genre;
	}

	public void setGenre( String genre )
	{
		if ( genre != null )
		{
			this.genre = genre;
		}
	}

	public MediaLink[] getTrailers()
	{
		return trailers;
	}

	public void setTrailers( MediaLink[] trailers )
	{
		this.trailers = trailers;
	}

	public MediaLink[] getLinks()
	{
		return links;
	}

	public void setLinks( MediaLink[] links )
	{
		this.links = links;
	}

	public int compareTo( Movie arg0 )
	{
		return getDisplayName().compareToIgnoreCase( arg0.getDisplayName() );
	}

	@Override
	public Object clone() throws CloneNotSupportedException
	{
		final Movie movie = new Movie();
		
		movie.setDescription( getDescription() );
		movie.setDisplayName( getDisplayName() );
		movie.setGenre( getGenre() );
		movie.setId( getId() );
		movie.setImdbId( getImdbId() );
		movie.setLinks( getLinks() );
		movie.setMpaaRating( getMpaaRating() );
		movie.setName( getName() );
		movie.setPosterUrl( getPosterUrl() );
		movie.setRating( getRating() );
		movie.setReleaseDate( getReleaseDate() );
		movie.setTrailers( getTrailers() );
		movie.setYear( getYear() );
		
		return movie;
	}



}
