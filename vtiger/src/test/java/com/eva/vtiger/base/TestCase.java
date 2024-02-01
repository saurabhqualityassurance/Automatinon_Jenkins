package com.eva.vtiger.base;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase extends Base {

	@Test(groups = {"Smoke"})
	public void test1() {
		Assert.assertEquals("xyz", "abc");
		
		System.out.println("----Test1-------");
	}
	
	@Test
    public void test2() {
		System.out.println("-------Test2--------");
	}
	
}
