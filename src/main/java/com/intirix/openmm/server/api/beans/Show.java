package com.intirix.openmm.server.api.beans;

import java.io.Serializable;

import org.simpleframework.xml.Default;
import org.simpleframework.xml.Element;

@Default
public class Show implements Serializable, Cloneable
{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;
	
	private String name = "";
	
	private String displayName = "";
	
	@Element(required=false)
	private String tvdbId = "";
	
	@Element(required=false)
	private String tvdbLang = "en";
	
	@Element(required=false)
	private String imdbId = "";
	
	@Element(required=false)
	private String zap2itId = "";
	
	@Element(required=false)
	private String contentRating = "";
	
	@Element(required=false)
	private String bannerPath = "";
	
	@Element(required=false)
	private String description = "";
	
	private boolean active = true;

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
		if ( name != null )
		{
			this.name = name;
		}
	}

	public String getDisplayName()
	{
		return displayName;
	}

	public void setDisplayName( String displayName )
	{
		if ( displayName != null )
		{
			this.displayName = displayName;
		}
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

	public String getTvdbLang()
	{
		return tvdbLang;
	}

	public void setTvdbLang( String tvdbLang )
	{
		if ( tvdbLang != null )
		{
			this.tvdbLang = tvdbLang;
		}
	}

	public String getImdbId()
	{
		return imdbId;
	}

	public void setImdbId( String imdbId )
	{
		if ( imdbId != null )
		{
			this.imdbId = imdbId;
		}
	}

	public String getZap2itId()
	{
		return zap2itId;
	}

	public void setZap2itId( String zap2itId )
	{
		if ( zap2itId != null )
		{
			this.zap2itId = zap2itId;
		}
	}

	public String getContentRating()
	{
		return contentRating;
	}

	public void setContentRating( String contentRating )
	{
		if ( contentRating != null )
		{
			this.contentRating = contentRating;
		}
	}

	public String getBannerPath()
	{
		return bannerPath;
	}

	public void setBannerPath( String bannerPath )
	{
		if ( bannerPath != null )
		{
			this.bannerPath = bannerPath;
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

	
	
	public boolean getActive()
	{
		return active;
	}

	public void setActive( boolean active )
	{
		this.active = active;
	}

	@Override
	public Object clone() throws CloneNotSupportedException
	{
		final Show show = new Show();

		show.id = id;
		show.name = name;
		show.displayName = displayName;
		show.tvdbId = tvdbId;
		show.tvdbLang = tvdbLang;
		show.imdbId = imdbId;
		show.zap2itId = zap2itId;
		show.contentRating = contentRating;
		show.bannerPath = bannerPath;
		show.description = description;
		show.active = active;

		return show;
	}

	@Override
	public boolean equals( Object obj )
	{
		// TODO Auto-generated method stub
		return toString().equals( obj.toString() );
	}

	@Override
	public String toString()
	{
		return displayName;
	}
	
	
	
}
