package com.kuraido.codility.test;

import com.kuraido.codility.lesson4.MaxCounters;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 *
 * @author Clyde Velasquez
 */
public class MaxCountersTest {
	
	@Test
	public void testSomeMethod() {
		assertArrayEquals(new int[]{3, 2, 2, 4, 2}, MaxCounters.solution(5, new int[]{3, 4, 4, 6, 1, 4, 4}));
		assertArrayEquals(new int[]{4, 2, 3, 2, 2}, MaxCounters.solution(5, new int[]{2, 4, 4, 6, 3, 1, 1}));
	}
}
