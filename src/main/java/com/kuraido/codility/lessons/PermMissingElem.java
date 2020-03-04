package com.kuraido.codility.lessons;

import java.util.Arrays;

/**
 *
 * @author cvelasquez
 */
public class PermMissingElem {
	
	public static int solution(int[] A) {
		int missing = 1;
		int start = 1;
		
		if (A.length == 0) {
			return missing;
		}
		
		if (A.length <= 100000) {
			Arrays.sort(A);
			for (int i = 0; i < A.length; i++) {
				if (start != A[i]) {
					missing = A[i] - 1;
					break;
				}
				start++;
			}
		}
		
		return missing;
	}
}
