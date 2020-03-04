package test;

import com.kuraido.codility.lessons.TapeEquilibrium;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author cvelasquez
 */
public class TapeEquilibriumUnitTest {
	
	@Test
	public void test() {
		Assert.assertEquals(1,TapeEquilibrium.solution(new int[] {3, 1, 2, 4, 3}));
	}
}
