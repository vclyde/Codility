package com.kuraido.codility.lesson4;

/**
 *
 * @author Clyde Velasquez
 */
public class MissingInteger {
	
	public static int solution(int[] A) {
		int missing = 0;
		int[] counter = new int[1000001];
		
		if (A.length > 0 && A.length <= 100000) {
			for (int value : A) {
				if (value > 0 && value < 1000000) {
					counter[value]++;
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
