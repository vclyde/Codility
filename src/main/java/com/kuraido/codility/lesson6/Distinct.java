package com.kuraido.codility.lesson6;

import java.util.Arrays;

public class Distinct {

    public static int solution(int[] A) {
        int N = A.length;
        int ctr = 0;

        if (N > 0 && N <= 100_000) {
            int[] pos = new int[1_000_000];
            int[] neg = new int[1_000_000];

            for (int val : A) {
                if (val < 0) {
                    if (neg[val * -1] == 0) {
                        ctr++;
                        neg[val * -1]++;
                    }
                    // neg[val * -1]++;
                } else {
                    if (pos[val] == 0) {
                        ctr++;
                        pos[val]++;
                    }
                    // pos[val]++;
                }
            }
        }

        return ctr;
    }

    // Efficient solution
    public static int solution2(int[] A) {
        int N = A.length;
        int ctr = 0;
        Arrays.sort(A);

        if (N > 0) {
            ctr++;
        }

        // (i < N - 1) -> prevents ArrayIndexOutOfBoundsException
        for (int i = 0; i < N - 1; i++) {
            if (A[i] != A[i + 1]) {
                ctr++;
            }
        }

        return ctr;
    }
}
