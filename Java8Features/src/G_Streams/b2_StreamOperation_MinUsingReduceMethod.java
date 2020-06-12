package G_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class b2_StreamOperation_MinUsingReduceMethod {

	public static int getMinFromList(List<Integer> integer_list) {

		int min = integer_list.stream().reduce(0, (x, y) -> (x < y) ? x : y);

		return min;
	}

	public static Optional<Integer> getMinFromListWithoutDefValue(List<Integer> integer_list) {

		Optional<Integer> minVal = integer_list.stream().reduce((x, y) -> (x < y) ? x : y);

		return minVal;
	}

	public static void main(String args[]) {

		List<Integer> integer_list = Arrays.asList(1, 8, 9, 7, 6, 99, 2);

		System.out.println("With using default value:");
		System.out.println(getMinFromList(integer_list));// o/p
		// It will always return wrong o/p
		// So we should use only accumulator

		//
		System.out.println("Without using default value:");
		System.out.println(getMinFromListWithoutDefValue(integer_list));
		if (getMinFromListWithoutDefValue(integer_list).isPresent()) {
			System.out.println("Min value is :" + getMinFromListWithoutDefValue(integer_list).get());
		}

	}
}
