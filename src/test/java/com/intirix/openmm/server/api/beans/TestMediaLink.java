package com.intirix.openmm.server.api.beans;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class TestMediaLink
{

	@Test
	public void testSort()
	{
		final MediaLink ml1 = new MediaLink();
		ml1.setId( 1 );
		ml1.setInternal( false );
		ml1.setUrl( "TEST" );
		
		final MediaLink ml2 = new MediaLink();
		ml2.setId( 2 );
		ml2.setInternal( false );
		ml2.setUrl( "ABC" );
		
		final MediaLink ml3 = new MediaLink();
		ml3.setId( 3 );
		ml3.setInternal( true );
		ml3.setSize( 100 );
		ml3.setUrl( "TEST" );
		
		final MediaLink ml4 = new MediaLink();
		ml4.setId( 4 );
		ml4.setInternal( true );
		ml4.setSize( 200 );
		ml4.setUrl( "TEST" );
		
		Assert.assertEquals( -1, ml4.compareTo( ml1 ) );
		
		final MediaLink[] arr = new MediaLink[]{ ml1, ml2, ml3, ml4 };
		Arrays.sort( arr );
		
		Assert.assertEquals( ml4.getId(), arr[ 0 ].getId() );
		Assert.assertEquals( ml3.getId(), arr[ 1 ].getId() );
		Assert.assertEquals( ml2.getId(), arr[ 2 ].getId() );
		Assert.assertEquals( ml1.getId(), arr[ 3 ].getId() );
	}
}
