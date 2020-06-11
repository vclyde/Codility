package com.kuraido.codility.test;

import com.kuraido.codility.lesson6.Triangle;
import org.junit.Assert;
import org.junit.Test;

import static java.lang.Integer.MAX_VALUE;

public class TriangleTest {

    @Test
    public void exampleTest() {
        Assert.assertEquals(1, Triangle.solution(new int[] {10, 2, 5, 1, 8, 20}));
        Assert.assertEquals(0, Triangle.solution(new int[] {10, 50, 5, 1}));
    }

    @Test
    public void correctnessTest() {
        Assert.assertEquals(0, Triangle.solution(new int[]{}));
        Assert.assertEquals(0, Triangle.solution(new int[]{1}));
        Assert.assertEquals(0, Triangle.solution(new int[]{2, 1}));
        Assert.assertEquals(0, Triangle.solution(new int[]{3, 1, 1}));
        Assert.assertEquals(0, Triangle.solution(new int[]{2, 3, 1}));
        Assert.assertEquals(1, Triangle.solution(new int[]{2, 3, 2}));
        Assert.assertEquals(0, Triangle.solution(new int[]{-3, -2, 0}));
        Assert.assertEquals(0, Triangle.solution(new int[]{2, 3, 1}));
        Assert.assertEquals(1, Triangle.solution(new int[]{MAX_VALUE, MAX_VALUE, MAX_VALUE}));
    }
}
