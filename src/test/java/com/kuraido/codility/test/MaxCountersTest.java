package com.kuraido.codility.test;

import com.kuraido.codility.lessons.MaxCounters;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Clyde Velasquez
 */
public class MaxCountersTest {
	
	@Test
	public void testSomeMethod() {
		assertArrayEquals(new int[]{3, 2, 2, 4, 2}, MaxCounters.solution(5, new int[]{3, 4, 4, 6, 1, 4, 4}));

		
	}
}
