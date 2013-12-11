package com.intirix.openmm.server.api;

import org.simpleframework.xml.Default;

import com.intirix.openmm.server.api.beans.MoviePrefixCounts;

@Default
public class MoviePrefixListResponse
{

	private MoviePrefixCounts prefixes[] = new MoviePrefixCounts[]{};

	public MoviePrefixCounts[] getPrefixes()
	{
		return prefixes;
	}

	public void setPrefixes( MoviePrefixCounts[] prefixes )
	{
		this.prefixes = prefixes;
	}
	
	

}
