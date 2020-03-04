package com.kuraido.codility.lessons;

/**
 *
 * @author cvelasquez
 */
public class TapeEquilibrium {

	public static int solution(int[] A) {
		int min = Integer.MAX_VALUE;
		
		if (A.length < 2) {
			return 0;
		}

		if (A.length == 2) {
			return Math.abs(A[0] - A[1]);
		}

		if (A.length > 2 && A.length <= 100000) {
			int sum1 = 0, sum2 = 0, p;
			for (int i = 0; i < A.length - 1; i++) {
				for (int j = 0; j <= i; j++) {
					sum1 += A[j];
				}

				for (int k = i + 1; k < A.length; k++) {
					sum2 += A[k];
				}

				p = Math.abs(sum1 - sum2);
				System.out.println(sum1 + " - " + sum2 + " = " + p);
				sum1 = 0;
				sum2 = 0;
				if (p < min) {
					min = p;
				}

			}
		}

		return min;
	}
}
