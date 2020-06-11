package com.kuraido.codility.lesson6;

import java.util.Arrays;

public class Triangle {

    public static int solution(int[] A) {
        int isTriangular = 0;
        int N = A.length;

        if (N > 2 && N <= 100_000) {
            Arrays.sort(A);
            for (int i = 0; i + 2 < N; i++) {
                if (((long) A[i] + A[i + 1]) > A[i + 2]) {
                    isTriangular = 1;
                    break;
                }
            }
        }

        return isTriangular;
    }
}
