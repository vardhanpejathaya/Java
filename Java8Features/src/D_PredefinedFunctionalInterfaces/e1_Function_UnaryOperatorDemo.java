package D_PredefinedFunctionalInterfaces;

import java.util.function.UnaryOperator;

/*
 * Unary operator: A function that should accept same input and output data type, such a function is
 *  called Unary operator.
 *  its a extension of function.
 *  public interface UnaryOperator<T> extends Function<T, T>
 */
public class e1_Function_UnaryOperatorDemo {

	static UnaryOperator<String> unaryop = name -> name.toUpperCase();

	public static void main(String args[]) {

		System.out.println(unaryop.apply("vardhan"));
	}
}
