package com.experts10.Summatra.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * test class
 */
public class PairSummaterTest {

	private IArraySummater p;
	private int[] nullArray;
	private int[] empty ;
	private int[] one ;
	private int[] simple;
	private int simplePair;

	/**
	 * constructor of test
	 */
	public PairSummaterTest() {
		p = new PairSummater();
		nullArray = null;
		empty = new int[0];
		one = new int[1];
		one[0] = 1;
		simple = new int[]{1,2,3,4};
		simplePair = 7;
	}

	/**
	 * test ordinary
	 */
	@Test
	public void sumOrdinary() throws ArraySummaterException {
		assertEquals(simplePair, p.sum(simple));
	}

	/**
	 * test not even exception
	 */
	@Test(expected = ArraySummaterException.class)
	public void sumNotEven() throws ArraySummaterException {
		p.sum(one);
	}

	/**
	 * test null exception
	 */
	@Test(expected = ArraySummaterException.class)
	public void sumNull() throws ArraySummaterException {
		p.sum(nullArray);

	}

	/**
	 * test empty
	 */
	@Test
	public void sumEmpty() throws ArraySummaterException {
		assertEquals(Integer.MIN_VALUE , p.sum(empty));
	}
}