package com.kuraido.codility.lesson7;

/**
 *
 * @author Clyde Velasquez
 */
public class Brackets {

	public static int solution(String s) {
		Stack stack = new Stack(s.length());

		if (s.length() <= 200_000) {
			for (char val : s.toCharArray()) {
				if (val == '{' || val == '[' || val == '(') {
					stack.push(val);
				} else if ((stack.peak() == '{' && val == '}')
					|| (stack.peak() == '[' && val == ']')
					|| (stack.peak() == '(' && val == ')')) {
					stack.pop();
				} else if (val == '}' || val == ']' || val == ')') {
					stack.push(val);
				}
			}
		}
		return stack.isEmpty() ? 1 : 0;
	}

	public static class Stack {

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
}
