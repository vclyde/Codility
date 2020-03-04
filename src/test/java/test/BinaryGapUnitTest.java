package test;

import com.kuraido.codility.lessons.BinaryGap;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author cvelasquez
 */
public class BinaryGapUnitTest {
	
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
