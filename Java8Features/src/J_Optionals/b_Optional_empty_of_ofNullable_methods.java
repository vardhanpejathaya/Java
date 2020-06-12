package J_Optionals;

import java.util.Optional;

public class b_Optional_empty_of_ofNullable_methods {

	
	public static Optional<String> ofNullabe() {
		
		return Optional.ofNullable("Vardhan");
	}
	
	public static Optional<String> of() {
		return Optional.of("ram");
	}
	
	public static Optional<String> empty() {
		return Optional.empty();
	}
	
	
	public static void main(String args[]) {
		
		System.out.println("ofNullabe -----"+ofNullabe());//Optional[vardhan],Optional.empty
		System.out.println("ofNullabe ------"+ofNullabe().get());//vardhan
		
		System.out.println("of() --------"+of());//if value  is null: java.lang.NullPointerException
		System.out.println("of() --------"+of().get());//ram
		
		System.out.print("empty ------ "+empty());//Optional.empty
	}
}
