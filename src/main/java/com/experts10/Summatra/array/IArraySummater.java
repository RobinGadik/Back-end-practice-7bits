package com.experts10.Summatra.array;

/**
 * Interface of ArraySummater
 */
interface IArraySummater {
	/**
	 *
	 * @param array - input array
	 * @return int - result
	 * @throws ArraySummaterException - if something wrong
	 */
	int sum(int[] array) throws ArraySummaterException;
}
