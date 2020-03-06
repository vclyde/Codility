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
	
	@Test
	public void test2() {
		int n = 100000;
		int[] a = new int[n];
		System.out.println(Integer.MIN_VALUE);
		n++;
		System.out.println((n * (n + 1) / 2));
		int c = 2;
		for (int i = 0; i < a.length; i++) {
			a[i] = c++; 
		}
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println((n * (n + 1) / 2) - sum);
		
		System.out.println(Integer.MIN_VALUE + -2147483647);
		
	}
}
