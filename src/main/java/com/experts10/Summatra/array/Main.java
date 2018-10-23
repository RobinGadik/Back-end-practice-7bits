package com.experts10.Summatra.array;

/**
 *
 */
final class Main {

	private Main() {
	}

	/**
	 * @param args - unknown
	 * @throws ArraySummaterException - shoulld not to be
	 */
	public static void main(final String[] args) throws ArraySummaterException {
		int[] a = new int[Integer.valueOf(args[0])];
		for (int i = 0 ; i < Integer.valueOf(args[0]) ; i++) {
			a[i] = i + 1;
		}
		System.out.println(new SimpleSummater().sum(a));

		System.out.println("Simple sum 1 to 8");

		System.out.println(new PairSummater().sum(a));

		System.out.println("Pair sum 1 to 8");
	}

}
