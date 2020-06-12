package D_PredefinedFunctionalInterfaces;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

/*
 * Binary operator: extension of Bifunction: Function that should accept the 
 * 2 same data type and that should return the same return data type.
 * BinaryOperator<T> extends BiFunction<T,T,T>
 * methods: maxBy and minBy
 */

public class e2_Function_BinaryOperatorDemo {

	static BinaryOperator<Integer> biop = (a, b) -> a * b;

	static Comparator<Integer> comp = (x, y) -> x.compareTo(y);

	public static void main(String args[]) {

		System.out.println("Demo1----->" + biop.apply(10, 20));

		/*
		 * minBy demo
		 */
		BinaryOperator<Integer> minBy = BinaryOperator.minBy(comp);
		System.out.println("Demo --->minBy--->" + minBy.apply(3, 8));

		/*
		 * maxBy demo
		 */
		BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comp);
		System.out.println("Demo --->maxBy--->" + maxBy.apply(12, 15));
	}
}
