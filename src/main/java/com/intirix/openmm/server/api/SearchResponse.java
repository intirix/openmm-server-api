package com.intirix.openmm.server.api;

import org.simpleframework.xml.Default;

import com.intirix.openmm.server.api.beans.SearchResult;

@Default
public class SearchResponse
{

	private SearchResult[] results;

	public SearchResult[] getResults()
	{
		return results;
	}

	public void setResults( SearchResult[] results )
	{
		this.results = results;
	}
	
	

}
