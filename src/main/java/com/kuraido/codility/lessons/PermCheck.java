package com.kuraido.codility.lessons;

/**
 *
 * @author cvelasquez
 */
public class PermCheck {

	public int solution1(int[] A) {
		int isPermutation = 1;
		int sum = (A.length * (A.length + 1)) / 2;
		int sum2 = 0;

		for (int value : A) {
			sum2 += value;
		}

		if ((sum - sum2) != 0) {
			isPermutation = 0;
		}

		return isPermutation;
	}

	public static int solution(int[] A) {
		int N = A.length, isPermutation = 0;
		int sum = (N * (N + 1)) / 2;
		int[] a = new int[1000001];

		if (N > 0 && N <= 100000) {

			for (int value : A) {
				if (value > 100000) {
					return isPermutation;
				}
				a[value]++;
			}

			for (int i = 0; i < a.length; i++) {
				if (a[i] > 0) {
					sum -= i;
				}
			}

			if (sum == 0) {
				isPermutation = 1;
			}
		}

		return isPermutation;
	}
}
