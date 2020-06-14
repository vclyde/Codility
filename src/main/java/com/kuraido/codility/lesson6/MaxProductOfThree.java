package com.kuraido.codility.lesson6;

import java.util.Arrays;

public class MaxProductOfThree {

    public static int solution(int[] A) {
        int N = A.length;
        int maxProduct = Integer.MIN_VALUE;

        if (N > 2 && N <= 100_000) {
            Arrays.sort(A);
            for (int i = 0; i < N; i++) {
                // i % N will return back to index 0 when i == N
                if ((A[i % N] * A[(i + 1) % N] * A[(i + 2) % N]) > maxProduct) {
                    maxProduct = A[i % N] * A[(i + 1) % N] * A[(i + 2) % N];
                }
            }
        } else {
            maxProduct = 0;
        }

        return maxProduct;
    }
}
