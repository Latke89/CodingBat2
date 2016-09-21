package com.tiy.close;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Brett on 9/21/16.
 */
public class LuckySumTest {

	LuckySum myTest;

	@Before
	public void setUp() throws Exception {
		myTest = new LuckySum();
	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void aIsthirteen() throws Exception {
		int sum = myTest.luckySum(13, 44, 9);
		assertEquals(0, sum);
	}

	@Test
	public void bIsThirteen() throws Exception {
		int sum = myTest.luckySum(1, 13, 44);
		assertEquals(1, sum);
	}

	@Test
	public void cIsThirteen() throws Exception {
		int sum = myTest.luckySum(7, 33, 13);
		assertEquals(40, sum);
	}

	@Test
	public void noThirteen() throws Exception {
		int sum = myTest.luckySum(12, 10, 8);
		assertEquals(30, sum);
	}

}