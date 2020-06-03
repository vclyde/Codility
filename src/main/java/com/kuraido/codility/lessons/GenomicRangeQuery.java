package com.kuraido.codility.lessons;

/**
 *
 * @author Clyde Velasquez
 */
public class GenomicRangeQuery {

	public static int[] solution(String S, int[] P, int[] Q) {
		int m = P.length;
		int[] result = new int[m];

		// Constraints
		if (!S.isEmpty() && S.length() <= 100000) {
			if ((P.length == Q.length) && (P.length > 0 && P.length <= 50000)
				&& (Q.length > 0 && Q.length <= 50000)) {

				// Converting to impact factor
				int[] iF = new int[S.trim().length()];
				for (int i = 0; i < iF.length; i++) {
					switch (S.charAt(i)) {
						case 'A':
							iF[i] = 0;
							break;
						case 'C':
							iF[i] = 1;
							break;
						case 'G':
							iF[i] = 2;
							break;
						case 'T':
							iF[i] = 3;
							break;
						default:
							break;
					}
				}
				
				// Frequencies
				int[][] freq = new int[S.trim().length()][4];
				for (int i = 0; i < iF.length; i++) {
					freq[i][iF[i]] = 1;
				}
				
				// Prefix sum 
				for (int i = 1; i < freq.length; i++) {
					for (int j = 0; j < freq[0].length; j++) {
						freq[i][j] = freq[i][j] + freq[i - 1][j];
					}
				}
				
				int sum;
				for (int i = 0; i < m; i++) {
					
					// Loop per column
					for (int j = 0; j < 4; j++) {
						
						// Subtract to get the sum of a specific 
						// range in (P, Q)
						if (P[i] > 0) {
							sum = freq[Q[i]][j] - freq[P[i] - 1][j];
						} else {
							// If P is 0 automatically get the sum at index Q
							sum = freq[Q[i]][j];
						}
						
						if (sum > 0) {
							result[i] = j + 1;
							break;
						}
					}
				}
			}
		}
		
		return result;
	}

	public static int[] solution1(String S, int[] P, int[] Q) { 
		int M = P.length;
		int[] query = new int[M];

		if (!S.isEmpty() && S.length() <= 100000) {
			if ((P.length == Q.length) && (P.length > 0 && P.length <= 50000)
				&& (Q.length > 0 && Q.length <= 50000)) {

				int[] factor = impactFactor(S);
				for (int K = 0; K < M; K++) {
					int[] count = new int[5];

					for (int i = P[K]; i <= Q[K]; i++) {
						count[factor[i]]++;
					}

					for (int i = 1; i < count.length; i++) {
						if (count[i] > 0) {
							query[K] = i;
							break;
						}
					}
				}
			}
		}

		return query;
	}
	
	private static int[] impactFactor(String s) {
		int[] ss = new int[s.length()];

		for (int i = 0; i < ss.length; i++) {
			switch (s.charAt(i)) {
				case 'A':
					ss[i] = 1;
					break;
				case 'C':
					ss[i] = 2;
					break;
				case 'G':
					ss[i] = 3;
					break;
				case 'T':
					ss[i] = 4;
					break;
				default:
					break;
			}
		}

		return ss;
	}
}
