package com.experts10.Summatra.array;

/**
 * all elements summater
 */

public class SimpleSummater implements IArraySummater {

	/**
	 *
	 * @param array - input array
	 * @return int - summ all
	 * @throws ArraySummaterException - null array
	 */

	public int sum(final int[] array) throws ArraySummaterException {

		if (null == array) {
			throw new ArraySummaterException();
		}

		int sum = 0;

		for (int i:array) {
			sum += i;
		}

		return sum;
	}

}
