package com.vclyde.codility.lesson3;

/**
 *
 * @author cvelasquez
 */
public class PermMissingElem {

	public static int solution(int[] A) {
		int N = A.length;
		int sum = 0;
		int missing = 0;

		if (N <= 100000) {
			for (int i = 0; i < N; i++) {
				sum += A[i];
			}

			N++;
			missing = (N * (N + 1) / 2) - sum;
			if (missing < 0) {
				missing = Integer.MIN_VALUE + missing;
			}
		}

		return missing;
	}
}
