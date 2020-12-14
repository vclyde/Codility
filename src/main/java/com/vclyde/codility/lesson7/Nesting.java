package com.vclyde.codility.lesson7;

public class Nesting {

    public static int solution(String s) {
        Stack stack = new Stack(s.length());

        if (s.length() <= 1_000_000) {
            for (char c : s.toCharArray()) {
                if (c == '(') {
                    stack.push(c);
                } else if (c == ')' && stack.peak() == '(') {
                    stack.pop();
                } else if (c == ')') {
                    stack.push(c);
                }
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}
