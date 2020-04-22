package com.kuraido.codility.lessons;

/**
 *
 * @author Clyde Velasquez
 */
public class CountDiv {

	public static int solution(int A, int B, int K) {
		final int MAX = 2_000_000_000;
		int count = 0;

		// Constraints
		if ((A >= 0 && A <= MAX) && (B >= 0 && B <= MAX)) {
			if (A <= B && K > 0 && K <= MAX) {

				count = (B / K) - (A / K);
				if (A % K == 0) {
					count++;
				}
			}
		}
		return count;
	}
}
