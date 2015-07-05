package com.zhenai;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testReverse() {
		Solution s = new Solution();
		assertEquals(321, s.reverse(123));
	}

}
