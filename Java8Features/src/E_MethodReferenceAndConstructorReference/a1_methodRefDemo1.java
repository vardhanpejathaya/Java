package E_MethodReferenceAndConstructorReference;

import java.util.function.Function;

/*
 * syntax of the method reference:
 * classname::methodname
 * class_instance_name::method_name
 * static_class_name::method_name
 */

public class a1_methodRefDemo1 {

	/*
	 * lambda implementation
	 */
	static Function<String, String> fun1 = s -> s.toUpperCase();

	/*
	 * Using method reference
	 */

	static Function<String, String> methodRefDemo = String::toUpperCase;

	public static void main(String args[]) {

		System.out.println("Using lambda implementation-->" + fun1.apply("VaRdhan"));
		System.out.println("Using method reference:---> " + methodRefDemo.apply("RaMakrisHna"));
	}
}
