package com.kuraido.codility.lessons;

import java.util.Arrays;

/**
 *
 * @author cvelasquez
 */
public class OddOccurrencesInArray {

	public static int solution(int[] A) {
		int unpaired = 0; // Default
		int N = A.length;

		if (N % 2 != 0 && N > 0 && N <= 1000000) {

			Arrays.sort(A);
			unpaired = A[0];
			int ctr = 1;
			
			for (int i = 1; i < N; i++) {
				if (unpaired == A[i]) {
					ctr++;
				} else {
					System.out.println(ctr);
					if (ctr % 2 == 0) { 
						ctr = 1;
						unpaired = A[i];
					} else {
						break;
					}
				}
			}

		} else {
			return unpaired;
		}

		return unpaired;
	}
}
