package com.vclyde.codility.test;

import com.vclyde.codility.lesson5.MinAvgTwoSlice;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Clyde Velasquez
 */
public class MinAvgTwoSliceTest {

	@Test
	public void exampleTest() {
		Assert.assertEquals(1, MinAvgTwoSlice.solution(new int[]{4, 2, 2, 5, 1, 5, 8}));
		Assert.assertEquals(2, MinAvgTwoSlice.solution(new int[]{-3, -5, -8, -4, -10}));
		Assert.assertEquals(0, MinAvgTwoSlice.solution(new int[]{4, 2, 5}));
	}

	@Test
	public void correctnessTest() {
		int[] a = new int[100];
		int val = 100;
		for (int i = 0; i < a.length; i++) {
			a[i] = val--;
		}

		System.out.println(MinAvgTwoSlice.solution(a));
	}

	@Test
	public void performanceTest() {
		int[] a = new int[100000];

		for (int i = 0; i < a.length; i++) {
			a[i] = i;
		}

		MinAvgTwoSlice.solution(a);

	}
}