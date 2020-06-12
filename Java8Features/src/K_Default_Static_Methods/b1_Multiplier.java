package K_Default_Static_Methods;

import java.util.List;

public interface b1_Multiplier {

	public int multiply(List<Integer> intlist);
	
	//default methods
	default int getSizeOfList(List<Integer> intlist) {
		System.out.println("I am from interface");
		return intlist.size();
	}
	
	//static method
	static boolean emptyCheckForList(List<Integer> intlist) {
		
		return intlist != null &&  intlist.size()>0;
	}
}
