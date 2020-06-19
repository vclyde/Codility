package com.kuraido.codility.lesson7;

public class Stack {

    private final char[] stack;
    private int count = 0;

    public Stack(int size) {
        stack = new char[size];
    }

    public void push(char c) {
        if (count < stack.length) {
            stack[count] = c;
            count++;
        }
    }

    public char pop() {
        if ((count - 1) < 0) {
            return '\0'; // Empty array
        }
        return stack[--count];
    }

    public char peak() {
        if ((count - 1) < 0) {
            return '\0';
        }
        return stack[count - 1];
    }

    public boolean isEmpty() {
        return count == 0;
    }
}