package com.kuraido.codility.test;

import com.kuraido.codility.lessons.PermCheck;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author cvelasquez
 */
public class PermCheckTest {

	@Test
	public void test() {
		Assert.assertEquals(1, PermCheck.solution(new int[] {4, 1, 3, 2}));
		Assert.assertEquals(0, PermCheck.solution(new int[] {4, 1, 3}));
		Assert.assertEquals(0, PermCheck.solution(new int[] {1, 4, 1}));
		Assert.assertEquals(1, PermCheck.solution(new int[] {1}));
		Assert.assertEquals(0, PermCheck.solution(new int[] {1_000_000_000}));
	}
}
