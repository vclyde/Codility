package com.kuraido.codility.test;

import com.kuraido.codility.lesson4.FrogRiverOne;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author cvelasquez
 */
public class FrogRiverOneTest {

	@Test
	public void test() {

		Assert.assertEquals(6, FrogRiverOne.solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}));
		Assert.assertEquals(5, FrogRiverOne.solution(5, new int[]{1, 1, 2, 3, 5, 4}));
		Assert.assertEquals(1, FrogRiverOne.solution(2, new int[]{2, 1}));
		Assert.assertEquals(-1, FrogRiverOne.solution(2, new int[]{}));
		Assert.assertEquals(0, FrogRiverOne.solution(1, new int[]{1}));
	}
}
