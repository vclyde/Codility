package com.vclyde.codility.lesson3;

/**
 *
 * @author cvelasquez
 */
public class TapeEquilibrium {

	public static int solution(int[] A) {
		int min = Integer.MAX_VALUE;
		
		if (A.length == 2) {
			return Math.abs(A[0] - A[1]);
		}

		if (A.length > 2 && A.length <= 100000) {
			
			int sum = 0;
			for (int value : A) {
				sum += value;
			}

			int h1 = 0, h2 = sum;
			int p;
			for (int value : A) {
				h1 += value;
				h2 -= value;
				p = Math.abs(h1 - h2);

				if (p < min) {
					min = p;
				}
			}
		}

		return min;
	}
}
