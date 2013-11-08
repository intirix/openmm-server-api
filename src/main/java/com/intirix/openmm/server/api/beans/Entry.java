package com.intirix.openmm.server.api.beans;

import java.io.Serializable;

import org.simpleframework.xml.Default;

@Default
public class Entry implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;

	public String getName()
	{
		return name;
	}

	public void setName( String name )
	{
		this.name = name;
	}
	
	
}
