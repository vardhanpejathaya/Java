package A_ImperativiveVSDeclarative_programming;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Program to remove the duplicate items from the list
 */

public class ImperativiveVSDeclarative_demo1 {

	public static void main(String args[]) {
		/*
		 * Imperative approch
		 */

		List<Integer> dup_list = Arrays.asList(1, 2, 3, 3, 4, 5, 1, 2, 7, 8, 9, 6, 6);
		List<Integer> non_dup_list = new ArrayList<>();

		for (Integer i : dup_list) {
			if (!non_dup_list.contains(i)) {
				non_dup_list.add(i);
			}
		}

		System.out.println("Imperative approach -> " + non_dup_list);

		/*
		 * Declarative approach
		 */

		List l = dup_list.stream().distinct().collect(Collectors.toList());

		System.out.println("Declarative approach ->" + l);
	}
}
