package com.kuraido.codility.lesson5;

/**
 *
 * @author Clyde Velasquez
 */
public class MinAvgTwoSlice {

	public static int solution(int[] a) {
		int startIndex = 0;
		int n = a.length;

		if (n >= 2 && n <= 100000) {
			int[] pSum = prefixSum(a);
			double minAvg = Integer.MAX_VALUE;
			double avg;

			for (int i = 0; i < pSum.length; i++) {

				// i+2 prevents exceeding the length of the prefix sum array
				if (i + 2 < pSum.length) {
					avg = (pSum[i + 2] - pSum[i]) / 2.0;
					if (avg < minAvg) {
						minAvg = avg;
						startIndex = i;
					}
				}

				// i+3 prevents exceeding the length of the prefix sum array 
				if (i + 3 < pSum.length) {
					avg = (pSum[i + 3] - pSum[i]) / 3.0;
					if (avg < minAvg) {
						minAvg = avg;
						startIndex = i;
					}
				}
			}
		}

		return startIndex;
	}

	private static int[] prefixSum(int[] a) {
		int[] sum = new int[a.length + 1];

		for (int i = 1; i < sum.length; i++) {
			sum[i] = sum[i - 1] + a[i - 1];
		}

		return sum;
	}
}
