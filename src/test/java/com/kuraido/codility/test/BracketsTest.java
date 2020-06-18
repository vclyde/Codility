package com.kuraido.codility.test;

import com.kuraido.codility.lesson7.Brackets;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Clyde Velasquez
 */
public class BracketsTest {
	
	@Test
	public void exampleTest() {
		assertEquals(1, Brackets.solution("{[()()]}"));
		assertEquals(0, Brackets.solution("([)()]"));
	}
	
	@Test
	public void correctnessTest() {
		assertEquals(1, Brackets.solution(""));
		assertEquals(1, Brackets.solution("()"));
		assertEquals(0, Brackets.solution("("));
		assertEquals(1, Brackets.solution("(){}[]"));
		assertEquals(1, Brackets.solution("{{[](){}}}"));
		assertEquals(0, Brackets.solution("{{[](){}}"));
		assertEquals(0, Brackets.solution("}{"));
		assertEquals(0, Brackets.solution("}])"));
	}
}
