package G_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class b1_StreamOperation_MaxUsingReduceMethod1 {

	//with default value
	public static int getmaxItem(List<Integer> integer_list) {

		return integer_list.stream().reduce(0, (x, y) -> (x > y) ? x : y);
	}

	//without default value
	public static Optional<Integer> getmaxItemWithoutDefault(List<Integer> integer_list) {

		return integer_list.stream().reduce((x, y) -> (x > y) ? x : y);
	}

	public static void main(String args[]) {

		List<Integer> integer_list = Arrays.asList(1, 8, 9, 7, 6, 99, 2);

		System.out.println(getmaxItem(integer_list));

		// Empty list
		List<Integer> integer_list1 = new ArrayList<Integer>();
		System.out.println(getmaxItem(integer_list1));// printing 0 this is wrong o/p

		// To avoid these scenarios we can go for Optional
		System.out.println(getmaxItemWithoutDefault(integer_list1));
		if (getmaxItemWithoutDefault(integer_list1).isPresent()) {
			System.out.println(getmaxItemWithoutDefault(integer_list1).get());
		} else {
			System.out.println("Empty list!!!");
		}

		// with value
		// To avoid these scenarios we can go for Optional
		System.out.println(getmaxItemWithoutDefault(integer_list));
		if (getmaxItemWithoutDefault(integer_list).isPresent()) {
			System.out.println(getmaxItemWithoutDefault(integer_list).get());
		} else {
			System.out.println("Empty list!!!");
		}
	}
}
