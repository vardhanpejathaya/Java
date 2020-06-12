package H_NumericStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
/*
 * Numeric stream:
 * --------------
 * In this example,Since Integer is wrapper class,Every time it has to do Un-boxing to convert into int.(performance issue).
 * To avoid these scenarios, we can use Numeric stream.(IntStream,LongStream,DoubleStream)
 */
public class a_NumericStream_IntStream_Demo {

	/*
	 * Using Stream() method
	 */
	public static int SumOfNumbersUsingStream(List<Integer> intRanges) {

		return intRanges.stream()
				.reduce(0, (a, b) -> a + b);//Since Integer is Wrapper class,Every time it has to do Un-boxing to convert 
		//it into int.
	}
	
	/*
	 * Using IntStream() method-->To improve the performance.
	 */
	public static int SumOfNumbersUsingIntStream(List<Integer> intRanges) {
		
		return IntStream.rangeClosed(1, 7)
				.sum();
	}

	public static void main(String args[]) {

		List<Integer> intRanges = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

		System.out.println("Sum of integers using Stream() method --> " + SumOfNumbersUsingStream(intRanges));
		System.out.println("Sum of integers using IntStream() method --> "+SumOfNumbersUsingIntStream(intRanges));
	}
}
