package com.vclyde.codility.test;

import com.vclyde.codility.lesson1.BinaryGap;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author cvelasquez
 */
public class BinaryGapTest {
	
	@Test
	public void test1() {
		assertEquals(4, BinaryGap.solution(529));
		assertEquals(1, BinaryGap.solution(5));
		assertEquals(2, BinaryGap.solution(9));
		assertEquals(1, BinaryGap.solution(20));
		assertEquals(0, BinaryGap.solution(15));
		assertEquals(0, BinaryGap.solution(32));
		assertEquals(5, BinaryGap.solution(1041));
		assertEquals(0, BinaryGap.solution(32));
	}
}
