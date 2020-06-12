package D_PredefinedFunctionalInterfaces;

public class d2_FunctionDemo2 {

	public static String bindFun(String str) {
		/*
		 * re usability of functional interface- Function
		 */
		return d1_FunctionDemo1.fun2.apply(str);
	}

	public static void main(String args[]) {

		System.out.println(bindFun("vat"));
	}
}
