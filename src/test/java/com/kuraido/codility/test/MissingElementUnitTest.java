package com.kuraido.codility.test;

import com.kuraido.codility.lessons.MissingElement;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author cvelasquez
 */
public class MissingElementUnitTest {
	
	
	@Test // Example test
	public void test1() {
		assertEquals(5, MissingElement.solution(new int[]{1, 3, 6, 4, 1, 2}));
		assertEquals(4, MissingElement.solution(new int[]{1, 2, 3}));
		assertEquals(1, MissingElement.solution(new int[]{-1, -3}));
		
	}
	
	@Test // Correctness test
	public void test2() {
		
		assertEquals(2, MissingElement.solution(new int[]{1}));
		assertEquals(1, MissingElement.solution(new int[]{-3}));
		assertEquals(1, MissingElement.solution(new int[]{-0}));
		assertEquals(1, MissingElement.solution(new int[]{1000}));
		
		assertEquals(3, MissingElement.solution(new int[]{-3 ,0, -1, 0, 5, 1000, 2, 1}));

	}
	
	@Test // Performance test
	public void test3() {
		
	}
}
