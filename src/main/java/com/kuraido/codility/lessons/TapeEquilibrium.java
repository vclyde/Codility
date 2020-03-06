package com.kuraido.codility.lessons;

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
			for (int i = 0; i < A.length; i++) {
				sum += A[i];
			}

			int h1 = 0, h2 = sum;
			int p;
			for (int i = 0; i < A.length; i++) {
				h1 += A[i];
				h2 -= A[i];
				p = Math.abs(h1 - h2);

				if (p < min) {
					min = p;
				}
			}
		}

		return min;
	}
}
