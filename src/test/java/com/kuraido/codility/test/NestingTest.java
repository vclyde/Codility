package com.kuraido.codility.test;

import com.kuraido.codility.lesson7.Nesting;
import org.junit.Assert;
import org.junit.Test;

public class NestingTest {

    @Test
    public void exampleTest() {
        Assert.assertEquals(1, Nesting.solution("(()(())())"));
        Assert.assertEquals(0, Nesting.solution("())"));
    }

    @Test
    public void correctnessTest() {
        Assert.assertEquals(1, Nesting.solution(""));
        Assert.assertEquals(1, Nesting.solution("()"));
        Assert.assertEquals(1, Nesting.solution("()()()"));
        Assert.assertEquals(0, Nesting.solution(")"));
        Assert.assertEquals(0, Nesting.solution("("));
        Assert.assertEquals(0, Nesting.solution(")("));
        Assert.assertEquals(0, Nesting.solution("))))"));
        Assert.assertEquals(0, Nesting.solution("(((((((("));
    }
}
