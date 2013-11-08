package com.intirix.openmm.server.api.beans;

import java.io.Serializable;

import org.simpleframework.xml.Default;

@Default
public class Season implements Serializable, Cloneable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;
	
	private int showId;
	
	private String name;
	
	private int number;

	public int getId()
	{
		return id;
	}

	public void setId( int id )
	{
		this.id = id;
	}

	public int getShowId()
	{
		return showId;
	}

	public void setShowId( int showId )
	{
		this.showId = showId;
	}

	public String getName()
	{
		return name;
	}

	public void setName( String name )
	{
		this.name = name;
	}

	public int getNumber()
	{
		return number;
	}

	public void setNumber( int number )
	{
		this.number = number;
	}

	@Override
	public Object clone() throws CloneNotSupportedException
	{
		final Season season = new Season();

		season.id = id;
		season.showId = showId;
		season.name = name;
		season.number = number;
		
		return season;
	}

	
	
}
