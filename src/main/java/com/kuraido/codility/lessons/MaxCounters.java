package com.kuraido.codility.lessons;

/**
 *
 * @author cvelasquez
 */
public class MaxCounters {

	public static int[] solution(int N, int[] A) {
		int m = A.length;
		int[] counter = new int[N];
		int max = 0;

		if ((N > 0 && N <= 100000) && (m > 0 && m <= 100000)) { // Constraint
			for (int i = 0; i < m; i++) {

				if (A[i] > 0 && A[i] <= N) {
					counter[A[i] - 1]++;
					if (counter[A[i - 1]] > max) {
						max = counter[A[i] - 1];
					}
				}

//				if (A[i] > 0 && A[i] <= N) {
//					counter[A[i] - 1]++;
//					if (counter[A[i] - 1] > max) {
//						max = counter[A[i] - 1];
//					}
//				} else if (A[i] == (N + 1)) {
//					// Needs optimization
//					Arrays.fill(counter, max);
//				}
			}
		}

		return counter;
	}
}
