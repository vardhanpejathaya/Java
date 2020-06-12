package F_LambdaVariable;

import java.util.function.Consumer;

public class LambdaVariable1 {

	static int i1 = 20;

	public static void main(String args[]) {

		int i = 0;

		/*
		 * 1.Lambda expression's parameter i cannot redeclare another local variable
		 * defined in an enclosing scope.
		 */
		/*
		 * 2.we can redeclare i in class level scope(instance scope).
		 */

		Consumer<Integer> consVal = (i1) -> {
			System.out.println(i1 + LambdaVariable1.i1);
		};

		consVal.accept(10);// 30
	}
}
