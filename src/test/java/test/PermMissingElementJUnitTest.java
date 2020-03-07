package test;

import com.kuraido.codility.lessons.PermMissingElem;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author cvelasquez
 */
public class PermMissingElementJUnitTest {
	
	@Test
	public  void test() {
		Assert.assertEquals(4, PermMissingElem.solution(new int[]{2, 3, 1, 5}));
		
		Assert.assertEquals(1, PermMissingElem.solution(new int[]{}));
		
		Assert.assertEquals(2, PermMissingElem.solution(new int[]{1}));
		Assert.assertEquals(1, PermMissingElem.solution(new int[]{2}));
		
		Assert.assertEquals(2, PermMissingElem.solution(new int[]{1, 3}));
		Assert.assertEquals(1, PermMissingElem.solution(new int[]{2, 3}));
	}

}
