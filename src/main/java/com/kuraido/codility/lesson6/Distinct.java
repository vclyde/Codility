package com.kuraido.codility.lesson6;

import java.util.Arrays;

public class Distinct {

    public static int solution2(int[] A) {
        int N = A.length;
        int ctr = 0;

        // Presort the array
        Arrays.sort(A);

        if (N > 0) {
            ctr++;

            // (i < N - 1) -> prevents ArrayIndexOutOfBoundsException
            for (int i = 0; i < N - 1; i++) {
                if (A[i] != A[i + 1]) {
                    ctr++;
                }
            }
        }

        return ctr;
    }
}
