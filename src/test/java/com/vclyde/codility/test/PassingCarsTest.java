
package com.vclyde.codility.test;

import com.vclyde.codility.lesson5.PassingCars;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Clyde Velasquez
 */
public class PassingCarsTest {
	
	@Test
	public void exampleTest() {
		assertEquals(5, PassingCars.solution(new int[]{0, 1, 0, 1, 1}));
	}
	
	@Test
	public void correctnessTest() {
		assertEquals(0, PassingCars.solution(new int[]{0}));
		assertEquals(3, PassingCars.solution(new int[]{0, 1, 0, 1}));
		assertEquals(3, PassingCars.solution(new int[]{0, 1, 0, 1, 0}));
		assertEquals(4, PassingCars.solution(new int[]{0, 1, 1, 1, 1, 0}));
		assertEquals(3, PassingCars.solution(new int[]{1, 0, 1, 1, 1, 0}));
	}
	
	@Test
	public void performanceTest() {
		
	}
}
