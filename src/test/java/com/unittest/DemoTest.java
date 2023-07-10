package com.unittest;

import org.testng.Assert;
import org.testng.annotations.Test;

public final class DemoTest {

	public DemoTest() {	}

	   @Test
	    public void testUnitTestInGithubRunner(){
	        int actual = 1;
	        Assert.assertEquals(actual,1);
	    }
}
