package com.kuraido.codility.lessons;

public class Distinct {

    public static void main(String[] args) {

        // Counting sort
        
        
    }

    public int solution(int[] A) {
        int N = A.length;
        int ctr = 0;

        if (N > 0 && N <= 100_000) {
            int[] pos = new int[1_000_000];
            int[] neg = new int[1_000_000];

            for (int val : A) {
                if (val < 0) {
                    if (neg[val * -1] == 0) {
                        ctr++;
                    }
                    neg[val * -1]++;
                } else {
                    if (pos[val] == 0) {
                        ctr++;
                    }
                    pos[val]++;
                }
            }
        }

        return ctr;
    }
}
