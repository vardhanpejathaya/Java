package F_LambdaVariable;

import java.util.function.Consumer;

/*
 * Local variable vs Instance variable
 * Observations:
 * 1.Local variable val defined in an enclosing scope must be final or effectively final
 * 2.But above conditions are not applicable to class level variable scope.
 */
public class LambdaVariable2 {

	static int val = 10;

	public static void main(String args[]) {

		// int val = 10;

		Consumer<Integer> c = i -> {
			val++;
			System.out.println(i + val);
		};

		c.accept(20);
	}
}
