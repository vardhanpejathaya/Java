package K_Default_Static_Methods;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Reverse the list based on alphabetical order
 * default method for list interface after java 8:
 * 
 */
public class a1_DefaultMethod {

	public static void main(String args[]) {
		
		List<String> nameList = Arrays.asList("mike","jelly","jagav","zera","karan");
		
		//Prior to java 8
		/*
		 * Collections.sort(nameList, Collections.reverseOrder());
		 * 
		 * System.out.println("Prior to java 8 ===>"+nameList);
		 */
		
		//After java 8
		//sort is the default method in list interface
		//default void sort(Comparator<? super E> c) {}
		
		nameList.sort(Comparator.naturalOrder());
		System.out.println("After to java 8 ===>"+nameList);
		
		nameList.sort(Comparator.reverseOrder());
		System.out.println("After to java 8 reverse order===>"+nameList);
	}
}
