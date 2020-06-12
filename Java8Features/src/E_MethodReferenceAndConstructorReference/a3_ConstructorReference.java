package E_MethodReferenceAndConstructorReference;

import java.util.function.Function;
import java.util.function.Supplier;

import a1_Data.Student;

/*
 * syntax: Classname::new
 * class should have empty constructor
 */

public class a3_ConstructorReference {

	static Supplier<Student> stSupplier = Student::new;

	static Function<String, Student> stFunction = Student::new;

	public static void main(String args[]) {

		System.out.println(stSupplier.get());

		System.out.println(stFunction.apply("TTT"));
	}
}
