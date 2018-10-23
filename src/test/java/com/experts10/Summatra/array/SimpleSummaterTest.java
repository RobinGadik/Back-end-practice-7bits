package com.experts10.Summatra.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleSummaterTest {

	private IArraySummater p;
	private int[] nullArray;
	private int[] empty;
	private int[] simple;
	private int simpleSum;

	/**
	 * constructor of test
	 */
	public SimpleSummaterTest() {
		p = new SimpleSummater();
		nullArray = null;
		empty = new int[0];
		simple = new int[]{1,2,3,4};
		simpleSum = 10;
	}

	/**
	 * @throws ArraySummaterException - should not throw
	 */
	@Test
	public void sumOrdinary() throws ArraySummaterException {
		assertEquals(simpleSum, p.sum(simple));
	}

	/**
	 * @throws ArraySummaterException - null arg
	 */
	@Test(expected = ArraySummaterException.class)
	public void sumNull() throws ArraySummaterException {
		p.sum(nullArray);
	}

	/**
	 * @throws ArraySummaterException - shold not throw
	 */
	@Test
	public void sumEmpty() throws ArraySummaterException {
		assertEquals(0, p.sum(empty));
	}
}