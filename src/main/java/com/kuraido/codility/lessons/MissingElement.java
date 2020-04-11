package com.kuraido.codility.lessons;

/**
 *
 * @author Clyde Velasquez
 */
public class MissingElement {
	
	public static int solution(int[] A) {
		int missing = 0;
		int[] counter = new int[1000001];
		
		if (A.length > 0 && A.length <= 100000) {
			for (int i = 0; i < A.length; i++) {
				if (A[i] > 0 && A[i] < 1000000) {
					counter[A[i]]++;
				}
			}
			
			for (int i = 1; i < counter.length; i++) {
				if (counter[i] == 0) {
					missing = i;
					break;
				}
			}
		}
		
		return missing;
	}
}
