package com.kuraido.codility.lessons;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author cvelasquez
 */
public class MaxCountersTest {
	
	@Test
	public void test() {

		// Example test
		Assert.assertArrayEquals(new int[]{3, 2, 2, 4, 2}, MaxCounters.solution(5, new int[]{3, 4, 4, 6, 1, 4, 4}));
		
	}
}
