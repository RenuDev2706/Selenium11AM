package org.code;

import org.junit.Assert;
import org.junit.Test;

public class B {

	@Test
	public void tc1() {
		Assert.assertEquals("Given Values not matching", "selenium", "sel");
		System.out.println("Test case 1");

	}

	@Test
	public void tc3() {
		Assert.assertEquals("Given Values not matching", "selenium", "selenium");
		System.out.println("Test case 3");
	}

	@Test
	public void tc2() {
		System.out.println("Test case 2");
	}

}
