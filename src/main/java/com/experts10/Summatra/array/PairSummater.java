package com.experts10.Summatra.array;

/**
 * pairsummater class
 */

class PairSummater implements IArraySummater {

	/**
	 *
	 * @param array - input array
	 * @return int - max pair sum, INTEGER.MIN_VALUE if empty array
	 * @throws ArraySummaterException - array.lenght must be 2*N and null array
	 */

	public int sum(final int[] array) throws ArraySummaterException {

		if (null == array || array.length % 2 != 0) {
			throw new ArraySummaterException();
		}

		int max = Integer.MIN_VALUE;

		for (int i = 0 ; i < array.length / 2 ; i++) {
			if (array[i * 2] + array[i * 2 + 1] > max) {
				max = array[i * 2] + array[i * 2 + 1];
			}
		}

		return max;
	}

}
