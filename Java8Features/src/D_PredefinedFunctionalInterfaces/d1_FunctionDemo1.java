package D_PredefinedFunctionalInterfaces;

import java.util.function.Function;

public class d1_FunctionDemo1 {

	static Function<String, String> fun1 = (name) -> name.toUpperCase();
	static Function<String,String> fun2 = (name) -> name.concat("default");
	
	public static void main(String args[]) {
		
		System.out.println(fun1.apply("vardhan"));
		System.out.println(fun2.apply("ram"));
		
		/*
		 * andThen usecase
		 */
		System.out.println(fun1.andThen(fun2).apply("varDhan"));//VARDHANdefault
		
		/*
		 * compose usecase
		 */
		System.out.println(fun1.compose(fun2).apply("krishnakumar"));
	}
}
