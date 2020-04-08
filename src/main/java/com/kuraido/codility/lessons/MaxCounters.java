package com.kuraido.codility.lessons;

import java.util.Arrays;

/**
 *
 * @author cvelasquez
 */
public class MaxCounters {

	public static int[] solution(int N, int[] A) {
		int m = A.length;
		int[] counter = new int[N];

		// Constraints
		if ((N > 0 && N <= 100000) && (m > 0 && m <= 100000)) {
			int max = 0;
			for (int K = 0; K < m; K++) {
				// Ensure that each value of the array must be within the range of 1 to N+1
				if (A[K] > 0 && A[K] <= (N + 1)) {
					if (A[K] <= N) {
						counter[A[K] - 1]++;
						if (counter[A[K] - 1] > max) {
							max = counter[A[K] - 1];
						}
					} else if (A[K] == (N + 1)) {
						
						Arrays.fill(counter, max);
					}
				}
			}
		}
		return counter;
	}
}
