package com.intirix.openmm.server.api;

import org.simpleframework.xml.Default;

import com.intirix.openmm.server.api.beans.FileEntry;
import com.intirix.openmm.server.api.beans.FolderEntry;

@Default
public class BrowseResponse
{
	private String path;
	
	private FolderEntry[] folders = new FolderEntry[]{};
	
	private FileEntry[] files = new FileEntry[]{};
	
	
	public String getPath()
	{
		return path;
	}

	public void setPath( String path )
	{
		this.path = path;
	}

	public FolderEntry[] getFolders()
	{
		return folders;
	}

	public void setFolders( FolderEntry[] folders )
	{
		this.folders = folders;
	}

	public FileEntry[] getFiles()
	{
		return files;
	}

	public void setFiles( FileEntry[] files )
	{
		this.files = files;
	}

}
