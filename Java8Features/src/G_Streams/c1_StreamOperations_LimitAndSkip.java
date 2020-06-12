package G_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
 * limit(n): Apply the operation on n elements and skip the other elements
 * skip(n): Skip the specified n number and perform operations on remaining numbers.
 */

public class c1_StreamOperations_LimitAndSkip {

	public static Optional<Integer> limitDemo(List<Integer> integers_list) {
		
		Optional<Integer> res = integers_list.stream()
				.limit(3)//perform the operations on only
				// 3 elements 1+4+9 =14
				.reduce((a,b) -> a+b);
		
		return res;
	}
	
	public static Optional<Integer> skipDemo(List<Integer> integers_list) {
		return integers_list.stream()//Stream<Integer>
				.skip(3)//skip first 3 numbers 1,4,9 and perform operations on other numbers
				//5+7+8=20
				.reduce(Integer::sum);
	}
	
	public static void main(String args[]) {
		
		List<Integer> integers_list = Arrays.asList(1,4,9,5,7,8);
		
		System.out.println("Limit operation demo:");
		System.out.println(limitDemo(integers_list).get());
		
		System.out.println("Skip operation demo:");
		System.out.println(skipDemo(integers_list).get());
		
	}
}
