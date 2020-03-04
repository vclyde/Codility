package test;

import com.kuraido.codility.lessons.CyclicRotation;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author cvelasquez
 */
public class CyclicRotationJUnitTest {
	
	@Test
	public void test() {
		Assert.assertArrayEquals(new int[] { 9, 7, 6, 3, 8}, CyclicRotation.solution(new int[] {3, 8, 9, 7, 6}, 3));
		Assert.assertArrayEquals(new int[] { 0, 0, 0}, CyclicRotation.solution(new int[] {0, 0, 0}, 1));
		Assert.assertArrayEquals(new int[] { 1, 2, 3, 4}, CyclicRotation.solution(new int[] {1, 2, 3, 4}, 4));
		Assert.assertArrayEquals(new int[] { 4, 1, 2, 3}, CyclicRotation.solution(new int[] {1, 2, 3, 4}, 5));
		Assert.assertArrayEquals(new int[] {}, CyclicRotation.solution(new int[] {}, 5)); // Empty array
		Assert.assertArrayEquals(new int[] {1}, CyclicRotation.solution(new int[] {1}, 5)); // Single Element
		Assert.assertArrayEquals(new int[] {3, 4}, CyclicRotation.solution(new int[] {4, 3}, 1)); 
	}
}
