package com.kuraido.codility.lesson4;

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
			int currentMax = 0;
			int max = 0;
			for (int value : A) {
				// Ensure that each value of the array must be within the range of 1 to N+1
				if (value > 0 && value <= N) {
					if (counter[value - 1] < max) {
						counter[value - 1] = max;
					}

					counter[value - 1]++;

					if (counter[value - 1] > currentMax) {
						currentMax = counter[value - 1];
					}
				} else if (value == (N + 1)) {
					max = currentMax;
				}
			}

			// Set all remaining
			for (int i = 0; i < N; i++) {
				if (counter[i] < max) {
					counter[i] = max;
				}
			}
		}
		return counter;
	}
}
