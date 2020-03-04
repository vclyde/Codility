package test;

import com.kuraido.codility.lessons.OddOccurrencesInArray;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author cvelasquez
 */
public class OddOccurrencesInArrayUnitTest {
	
	@Test
	public void example() {
//		Assert.assertEquals(7, OddOccurrencesInArray.solution(new int[] {9, 3, 9, 3, 9, 7, 9}));
//		Assert.assertEquals(7, OddOccurrencesInArray.solution(new int[] {3, 9, 3, 3, 9, 3, 9, 7, 9}));
//		Assert.assertEquals(0, OddOccurrencesInArray.solution(new int[] {9, 3, 9, 3}));
//		Assert.assertEquals(1, OddOccurrencesInArray.solution(new int[] {1}));
//		Assert.assertEquals(0, OddOccurrencesInArray.solution(new int[] {1, 1}));
//		Assert.assertEquals(3, OddOccurrencesInArray.solution(new int[] {3, 1000, 1000}));
		Assert.assertEquals(1000, OddOccurrencesInArray.solution(new int[] {3, 1000, 1000, 1000, 3}));
	}
	
	@Test
	public void correctness() {
		
	}
}
