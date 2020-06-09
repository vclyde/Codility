package com.kuraido.codility.lesson5;

/**
 *
 * @author Clyde Velasquez
 */
public class PassingCars {

	public static int solution(int[] A) {

		int pairs = 0;
		int n = A.length;
		int[] prefixSum = prefixSum(A);

		if (n > 0 && n <= 100_000) {
			for (int i = 0; i < n; i++) {
				if (A[i] == 0) {
					pairs += countTotal(prefixSum, i, n - 1);
				}
			}
			pairs = pairs > 1_000_000_000 || pairs < 0 ? -1 : pairs;
		} else {
			pairs = -1;
		}

		return pairs;
	}

	private static int[] prefixSum(int[] a) {
		int[] sum = new int[a.length + 1];

		for (int i = 1; i < sum.length; i++) {
			sum[i] = sum[i - 1] + a[i - 1];
		}

		return sum;
	}

	private static int countTotal(int[] P, int x, int y) {
		return P[y + 1] - P[x];
	}

	private static int[] prefixSum2(int[] a) {
		int[] sum = new int[a.length];
		sum[0] = a[0];
		for (int i = 1; i < sum.length; i++) {
			sum[i] = sum[i - 1] + a[i];
		}
		return sum;
	}

	private static int countTotal2(int[] P, int x, int y) {
		if (x == 0) {
			return P[y];
		}
		return P[y] - P[x - 1];
	}
}
