package com.vclyde.codility.lesson3;

/**
 *
 * @author cvelasquez
 */
public class FrogJmp {

	public static int solution(int X, int Y, int D) {
		final int MAX = 1000000000;
		int steps = 0;

		if ((X > 0 && X <= MAX)	&& (Y > 0 && Y <= MAX) && (D > 0 && D <= MAX)) { // Constraints
			if (X <= Y) {
				int remaining = Y - X;
				steps = (remaining / D) + ((remaining % D) > 0 ? 1 : 0);
			}
		}
		
		return steps;
	}
}
