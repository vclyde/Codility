package com.kuraido.codility.lessons;

/**
 *
 * @author cvelasquez
 */
public class CyclicRotation {

	public static int[] solution(int[] A, int K) {
		int[] a = new int[A.length];

		if (K <= 0) {
			return A;
		}

		if (A.length > 0) {

			int k = K > A.length ? K % A.length : K;
			int ctr = 0;

			for (int i = k; i < a.length; i++) {
				a[i] = A[ctr++];
			}

			for (int i = 0; i < k; i++) {
				a[i] = A[ctr++];
			}
		} else {
			return A;
		}

		return a;
	}
}
