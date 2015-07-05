package com.zhenai;

import static org.junit.Assert.*;

import org.junit.Test;

public class ZigZagConversionTest {

	@Test
	public void testConvert() {
		ZigZagConversion s = new ZigZagConversion();
		String result = s.convert("AB", 1);
		assertEquals("AB", result);
	}

}
