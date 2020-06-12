package A_ImperativiveVSDeclarative_programming;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * Program to remove the duplicate items from the list
 */

public class ImperativiveVSDeclarative_demo2 {

	public static void main(String args[]) {
		/*
		 * Imperative approch
		 */

		int sum =0;
		
		for(int i=0;i<=100;i++) {
			sum = sum +i;
		}
	

		System.out.println("Imperative approach -> "+sum);

		/*
		 * Declarative approach
		 */

		int i = IntStream.rangeClosed(0,100)
		.sum();
		
		System.out.println("Declarative approach ->"+i);
	}
}
