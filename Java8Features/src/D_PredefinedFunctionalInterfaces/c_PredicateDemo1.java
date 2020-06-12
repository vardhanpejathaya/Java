package D_PredefinedFunctionalInterfaces;

import java.util.function.Predicate;

public class c_PredicateDemo1 {

	static Predicate<Integer> check = i -> i % 2 == 0;
	static Predicate<Integer> check2 = i -> i % 5 == 0;

	/*
	 * check number is even or odd
	 */
	public static void sampleDemo1() {

		System.out.println(check.test(4));

	}

	/*
	 * predicate - and method usage
	 */
	public static void sampleDemo2() {

		System.out.println(check.and(check2).test(4));
	}

	/*
	 * predicate - or method usage
	 */

	public static void sampleDemo3() {

		System.out.println(check.or(check2).test(4));
	}

	/*
	 * predicate - negate method usage
	 * 
	 */
	public static void sampleDemo4() {

		System.out.println(check.or(check2).negate().test(4));
	}

	public static void main(String args[]) {
		sampleDemo1();
		sampleDemo2();
		sampleDemo3();
		sampleDemo4();
	}
}
