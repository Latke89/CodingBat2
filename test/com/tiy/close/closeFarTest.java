package com.tiy.close;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Brett on 9/21/16.
 */
public class closeFarTest {

	CloseFar myTest;

	@Before
	public void setUp() throws Exception {
		myTest = new CloseFar();
	}

	@After
	public void tearDown() throws Exception {

	}


	@Test
	public void allClose() throws Exception {
		boolean b = myTest.closeFar(4, 5, 6);

		assertEquals(b, false);

	}

	@Test
	public void allFar() throws Exception {
		boolean b = myTest.closeFar(1, 7, 15);

		assertEquals(b, false);
	}

	@Test
	public void allSame() throws Exception {
		boolean b =myTest.closeFar(3, 3, 3);

		assertEquals(b, false);
	}

	@Test
	public void correct() throws Exception {
		boolean b = myTest.closeFar(4, 5, 9);

		assertEquals(b, true);
	}

	@Test
	public void notInARow() throws Exception {
		boolean b = myTest.closeFar(4, 6, 5);
		assertEquals(b, false);
	}

	@Test
	public void twoTheSameTrue() throws Exception {
		boolean b = myTest.closeFar(2, 2, 5);

		assertEquals(b, true);
	}

}