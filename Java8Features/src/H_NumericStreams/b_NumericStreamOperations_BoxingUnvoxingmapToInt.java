package H_NumericStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * Boxing: Conversion of primitive to Wrapper class is called as Boxing.
 * ex: into to Ineger
 * long to Long
 * boolean to Boolean
 * double to Double
 * Unboxing:Conversion of Wrapper class to primitive data type is called as Unboxing.
 * ex: Long to long
 * Boolean to boolean
 * Double to double
 */

public class b_NumericStreamOperations_BoxingUnvoxingmapToInt {

	/*
	 * Boxing sample
	 */
	
	public static List<Integer> Boxing() {
		return IntStream.rangeClosed(1, 10)
		.boxed()
		.collect(Collectors.toList());
	}
	
	/*
	 * UnBoxing sample
	 */
	
	public static int Unboxing(List<Integer> intList) {
		return intList.stream()
		.mapToInt(Integer::intValue)
		.sum();
	}
	
	public static void main(String args[]) {
	
		System.out.println("Boxing sample-----"+Boxing());
		
		List<Integer> inlist = Arrays.asList(1,2,2,5,6,7,9);
		System.out.println("UnBoxing sample------>"+Unboxing(inlist));
	
	}
}
