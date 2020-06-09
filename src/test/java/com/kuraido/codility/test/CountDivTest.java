package com.kuraido.codility.test;

import com.kuraido.codility.lesson5.CountDiv;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Clyde Velasquez
 */
public class CountDivTest {

	@Test
	public void exampleTest() {
		assertEquals(3, CountDiv.solution(6, 11, 2));
	}

	@Test
	public void correctnessTest() {
		assertEquals(1, CountDiv.solution(6, 6, 2));
		assertEquals(0, CountDiv.solution(6, 3, 2));
		assertEquals(0, CountDiv.solution(1, 1, 11));
		assertEquals(1, CountDiv.solution(11, 13, 2));
		assertEquals(1, CountDiv.solution(10, 10, 5));
		assertEquals(0, CountDiv.solution(10, 10, 7));
		assertEquals(0, CountDiv.solution(10, 10, 20));
		assertEquals(20, CountDiv.solution(11, 345, 17));
		assertEquals(2, CountDiv.solution(7, 20, 10));

	}

	@Test
	public void performanceTest() {
		assertEquals(1_000_000_000, CountDiv.solution(1, 2_000_000_000, 2));
	}
}
