package com.vclyde.codility.test;

import com.vclyde.codility.lesson4.MissingInteger;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author cvelasquez
 */
public class MissingIntegerTest {
	
	
	@Test // Example test
	public void test1() {
		assertEquals(5, MissingInteger.solution(new int[]{1, 3, 6, 4, 1, 2}));
		assertEquals(4, MissingInteger.solution(new int[]{1, 2, 3}));
		assertEquals(1, MissingInteger.solution(new int[]{-1, -3}));
		
	}
	
	@Test // Correctness test
	public void test2() {
		
		assertEquals(2, MissingInteger.solution(new int[]{1}));
		assertEquals(1, MissingInteger.solution(new int[]{-3}));
		assertEquals(1, MissingInteger.solution(new int[]{-0}));
		assertEquals(1, MissingInteger.solution(new int[]{1000}));
		
		assertEquals(3, MissingInteger.solution(new int[]{-3 ,0, -1, 0, 5, 1000, 2, 1}));

	}
	
	@Test // Performance test
	public void test3() {
		
	}
}
