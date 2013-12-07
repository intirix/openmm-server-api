package com.intirix.openmm.server.api.beans;

import org.simpleframework.xml.Default;

@Default
public class MediaLink implements Comparable< MediaLink >
{

	private int id;
	
	private String mediaTypeCode = "M";
	
	private boolean available = true;
	
	private boolean internal = true;
	
	private String url;
	
	private String service = "Local";
	
	private long size;
	
	
	

	public int getId()
	{
		return id;
	}




	public void setId( int id )
	{
		this.id = id;
	}




	public String getMediaTypeCode()
	{
		return mediaTypeCode;
	}




	public void setMediaTypeCode( String mediaTypeCode )
	{
		this.mediaTypeCode = mediaTypeCode;
	}




	public boolean isAvailable()
	{
		return available;
	}




	public void setAvailable( boolean available )
	{
		this.available = available;
	}




	public boolean isInternal()
	{
		return internal;
	}




	public void setInternal( boolean internal )
	{
		this.internal = internal;
	}




	public String getUrl()
	{
		return url;
	}




	public void setUrl( String url )
	{
		this.url = url;
	}




	public String getService()
	{
		return service;
	}




	public void setService( String service )
	{
		if ( service != null )
		{
			this.service = service;
		}
	}




	public long getSize()
	{
		return size;
	}




	public void setSize( long size )
	{
		this.size = size;
	}




	public int compareTo( MediaLink o )
	{
		if ( !o.internal && internal )
		{
			return -1;
		}
		else if ( !internal && o.internal )
		{
			return 1;
		}
		
		if ( o.size > size )
		{
			return 1;
		}
		else if ( o.size < size )
		{
			return -1;
		}
		
		return url.compareTo( o.url );
	}
	
	
}
