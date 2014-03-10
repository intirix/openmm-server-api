package com.intirix.openmm.server.api.beans;

import java.io.Serializable;

import org.simpleframework.xml.Default;

@Default
public class SearchResult implements Serializable, Cloneable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String title;
	
	private String description;
	
	private String type;
	
	private int refId;

	public String getTitle()
	{
		return title;
	}

	public void setTitle( String title )
	{
		this.title = title;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription( String description )
	{
		this.description = description;
	}

	public String getType()
	{
		return type;
	}

	public void setType( String type )
	{
		this.type = type;
	}

	public int getRefId()
	{
		return refId;
	}

	public void setRefId( int refId )
	{
		this.refId = refId;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		final SearchResult obj = new SearchResult();
		
		obj.setDescription( getDescription() );
		obj.setRefId( getRefId() );
		obj.setTitle( getTitle() );
		obj.setType( getType() );
		
		return obj;
	}


	

}
