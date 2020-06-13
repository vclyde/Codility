package com.kuraido.codility.test;

import com.kuraido.codility.lesson6.MaxProductOfThree;
import org.junit.Assert;
import org.junit.Test;

public class MaxProductOfThreeTest {

    @Test
    public void exampleTest() {
        Assert.assertEquals(60, MaxProductOfThree.solution(new int[]{-3, 1, 2, -2, 5, 6}));
    }

    @Test
    public void correctnessTest() {
        Assert.assertEquals(0, MaxProductOfThree.solution(new int[]{}));
        Assert.assertEquals(0, MaxProductOfThree.solution(new int[]{1}));
        Assert.assertEquals(0, MaxProductOfThree.solution(new int[]{1, 2}));
        Assert.assertEquals(12, MaxProductOfThree.solution(new int[]{4, 1, 3}));
        Assert.assertEquals(36, MaxProductOfThree.solution(new int[]{4, 1, 3, 3}));
        Assert.assertEquals(8, MaxProductOfThree.solution(new int[]{2, 2, 2, 2}));
        Assert.assertEquals(125, MaxProductOfThree.solution(new int[]{-5, 5, -5, 4}));
        Assert.assertEquals(999_000_000, MaxProductOfThree.solution(new int[]{1000, 999, 998, 997, -1000, -999, -998}));
        Assert.assertEquals(-991_025_976, MaxProductOfThree.solution(new int[]{-1000, -998, -997, -999, -996}));
    }

    @Test
    public void performanceTest() {

    }
}
