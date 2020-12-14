package com.vclyde.codility.lesson1;

/**
 *
 * @author cvelasquez
 */
public class BinaryGap {
	public static int solution(int N) {
		int gap = 0;
		int max = 0; // Largest Gap
		
		// Constraint
		if (N > 0 && N <= 2147483647) {
			char[] binary = Integer.toBinaryString(N).toCharArray();
			
			for (int i = 1; i < binary.length; i++) { 
				if (binary[i] == '0') {
					gap++;
				} else if (binary[i] == '1') {
					if (gap > max) {
						max = gap;
					}
					gap = 0; // Reset value
				}
			}
		}
		
		return max;
	}
}
