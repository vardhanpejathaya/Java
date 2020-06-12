package K_Default_Static_Methods;

import java.util.List;

public class b2_MultiplierImpl implements b1_Multiplier {

	@Override
	public int multiply(List<Integer> intlist) {
		return intlist
				.stream()
				.reduce(1, (a, b) -> a * b);
	}
	
	@Override
	public int getSizeOfList(List<Integer> intlist) {
		// TODO Auto-generated method stub
		System.out.println("I am from implemented class");
		return intlist.size();
	}
	
}
