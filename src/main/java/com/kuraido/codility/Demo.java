package com.kuraido.codility;

import java.util.Arrays;

/**
 *
 * @author cvelasquez
 */
public class Demo {

	public static int solution(int[] A) {
		int r = 1; // Default

		if (A.length >= 1 && A.length <= 100000) {

			Arrays.sort(A);

			if (A.length > 1) {
				for (int i = 1; i < A.length; i++) {

					if ((A[i] - A[i - 1]) > 1) {
						r = A[i - 1] + 1;
						if (A[i] > 0) {
							break;
						} else {
							r = 1;
						}
					} else {
						r = A[i] + 1;
						
					}
				}
			} else {
				return (A[0] == 1) ? 2 : r;
			}
		}
//		System.out.println(r);
		return r;
	}
}
