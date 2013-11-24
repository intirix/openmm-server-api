package com.intirix.openmm.server.api.beans;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.simpleframework.xml.Default;

@Default
public class Entry implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	
	private String encodedName;

	public String getName()
	{
		return name;
	}

	public void setName( String name )
	{
		this.name = name;
		try
		{
			encodedName = URLEncoder.encode( name, "UTF-8" );
		}
		catch ( UnsupportedEncodingException e )
		{
			encodedName = name;
		}
	}
	
	/**
	 * Get the URI encoded name
	 * @return
	 */
	public String getEncodedName()
	{
		return encodedName;
	}
	
	
}
