package G_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
 * reduce():
 * This is the terminal operation.
 * Used to reduce the content of the stream to the single value.
 * 
 * It takes the 2 parameter:
 * 1. First parameter::Default or initial value.
 * 2. Second parameter::BinaryOperator<T>
 * Binary operator: It should accept the 2 args having the same type and return the same type result.
 * ex: multiplication of the 2 numbers.
 */

public class a9_StreamOperation_reduce_method {

	public static int doMultiplication(List<Integer> integer_list) {
		
		int i = integer_list.stream()
		//reduce(default value,binary operator)
		/*
		 * inputs:1,3,5,7,9
		 * 1(default value),1(from stream)==> result is 1
		 * 1(early result),3(from stream)==> result is 3
		 * 3(early result),5(from stream)==> result is 15
		 * 15(early result),7(from stream)==> result is 105
		 * 105(early result),9(from stream)==> result is 945
		 */
		.reduce(1,(a,b) -> a*b);
		
		return i;
	}
	
	public static Optional<Integer> doMultiplicationWithoutDefaultValue(List<Integer> integer_list) {
		
		Optional<Integer> i = integer_list.stream()
		.reduce((a,b) -> a*b);
		
		return i;
	}
	
	public static void main(String args[]) {
		
		List<Integer> integers = Arrays.asList(1,3,5,7,9);
		List<Integer> integers_null = new ArrayList<Integer>();
		
		System.out.println("With having default value::(default value,BinaryOperator<T>)");
		System.out.println(doMultiplication(integers));
		
		System.out.println("Without default value:having value");
		System.out.println(doMultiplicationWithoutDefaultValue(integers).isPresent());
		System.out.println(doMultiplicationWithoutDefaultValue(integers).get());
		
		System.out.println("Without default value:having no value");
		//Optional - null value
		System.out.println(doMultiplicationWithoutDefaultValue(integers_null).isPresent());//false
		
		//if we use directly Optional.get() then we will get java.util.NoSuchElementException: No value present
		
		if(doMultiplicationWithoutDefaultValue(integers_null).isPresent()) {
			System.out.println(doMultiplicationWithoutDefaultValue(integers_null).get());
		}
		
	}
}
