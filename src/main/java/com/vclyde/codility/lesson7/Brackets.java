package com.vclyde.codility.lesson7;

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
}
