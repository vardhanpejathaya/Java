package B_ImplementsComparatorUsingLambda;

import java.util.Comparator;

public class ComparatorDemoUsingLambda {

	public static void main(String args[]) {

		/*
		 * Using Legacy
		 */

		Comparator<Integer> compar = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {

				return o1.compareTo(o2);
				/*
				 * o1 == o2 ->0 o1 > o2 -> 1 o1 < o2 -> -1
				 */
			}
		};

		System.out.println("Legacy comparator demo --> " + compar.compare(2, 3));
		System.out.println("Legacy comparator demo --> " + compar.compare(5, 4));

		/*
		 * Using java 8
		 */

		Comparator<Integer> compars = (Integer a, Integer b) -> a.compareTo(b);
		System.out.println("Lambda comparator demo --> " + compars.compare(6, 7));

		Comparator<Integer> compars1 = (a, b) -> -a.compareTo(b);
		System.out.println("Lambda comparator demo --> " + compars1.compare(8, 9));

	}
}
