package com.kuraido.codility.lessons;

/**
 *
 * @author cvelasquez
 */
public class FrogRiverOne {

	public static int solution(int X, int[] A) {
		int K = -1;
		int N = A.length;

		if ((N > 0 && N <= 100000) && (X > 0 && X < 100000)) {

			int total = (X * (X + 1)) / 2;
			int[] counter = new int[X + 1];

			for (int i = 0; i < N; i++) {

				if (counter[A[i]] == 0) {
					counter[A[i]] = 1;
					total -= A[i];
				}

				if (total == 0) {
					K = i;
					break;
				}
			}
		}

		return K;
	}
}
