package K_Default_Static_Methods;

/*
 * "Demo to show how the multiple inheritance  works in since java 8"
 *  Implementation in child class will take precedence
 * 
 */

public class c12_Client implements c1_interface1,c1_interface2,c1_interface3 {
	
	//Overrided methods from c1_interface3
	//It will take first precedence
	public void methodC() {

		System.out.println("in interface 3 ,Methods C " + c12_Client.class);
	}

	public static void main(String args[]) {
		
		c12_Client client = new c12_Client();
		
		//o/p:in interface 2 ,Methods A interface K_Default_Static_Methods.c1_interface2
		//Implementation for Method from c1_interface1 is overidded in c1_interface2, so it took precedence
		client.methodA();
		client.methodB();
		client.methodC();
	}
}
