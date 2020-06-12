package K_Default_Static_Methods;

public class d1_inheritanceComplex implements d2_interface1,d3_interface1 {

	/*
	 * We will get below errors if we have same methods in both interfaces:
	 * Duplicate default methods named A with the parameters () and () are inherited from the types d3_interface1 and d2_interface1
	 * so we should override duplicate method in this class and should provide the implementation for same.
	 */
	
	@Override
	public void A() {
		// TODO Auto-generated method stub
		System.out.println("I am from implementation class");
	}
	
	public static void main(String args[]) {
		d1_inheritanceComplex c = new d1_inheritanceComplex();
		c.A();
		//o/p: I am from implementation class
	}
}
