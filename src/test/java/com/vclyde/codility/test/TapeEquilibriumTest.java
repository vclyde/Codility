package com.vclyde.codility.test;

import com.vclyde.codility.lesson3.TapeEquilibrium;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author cvelasquez
 */
public class TapeEquilibriumTest {

	@Test
	public void test() {
		Assert.assertEquals(1, TapeEquilibrium.solution(new int[]{3, 1, 2, 4, 3}));
		Assert.assertEquals(0, TapeEquilibrium.solution(new int[]{40, 10, 50}));
	}
}
