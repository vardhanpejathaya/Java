package K_Default_Static_Methods;

import java.util.Arrays;
import java.util.List;

public class b3_MultiplierClient {

	public static void main(String args[]) {
		
		List<Integer> intlist = Arrays.asList(2,3,5);
		
		b1_Multiplier mult = new b2_MultiplierImpl();
		System.out.println(mult.multiply(intlist));
		
		//Call to default method
		//I am from implemented class
		//We can override default methods in its implemented classes.
		System.out.println("Call to default method  "+mult.getSizeOfList(intlist));
		
		//call to static method
		System.out.println("call to static method  "+b1_Multiplier.emptyCheckForList(intlist));
	}
}
