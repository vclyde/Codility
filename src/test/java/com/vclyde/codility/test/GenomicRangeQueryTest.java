package com.vclyde.codility.test;

import com.vclyde.codility.lesson5.GenomicRangeQuery;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 *
 * @author Clyde Velasquez
 */
public class GenomicRangeQueryTest {
	
	@Test
	public void exampleTest() {
		assertArrayEquals(new int[]{2, 4, 1}, GenomicRangeQuery.solution("CAGCCTA", new int[]{2, 5, 0}, new int[] {4, 5, 6}));
	}
}
