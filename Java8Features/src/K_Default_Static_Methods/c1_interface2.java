package K_Default_Static_Methods;

public interface c1_interface2 extends c1_interface1 {

	default void methodB() {

		System.out.println("in interface 2 ,Methods B " + c1_interface2.class);
	}

	default void methodA() {

		System.out.println("in interface 2 ,Methods A " + c1_interface2.class);
	}

}
