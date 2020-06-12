package J_Optionals;

import java.util.Optional;
import java.util.function.Consumer;

/*
 * Difference between ifPresent and isPresent is
 * ifPresent check if value is present what is next and ifPresent accept only Consumer
 * isPresent check whether value is present or not, returns boolean value
 */

public class d_Optional_ifPresent_isPresent {

	public static void main(String args[]) {
		
		//isPresent
		Optional<String> textData =  Optional.ofNullable("Vardhan");
		
		System.out.println(textData.isPresent());
		if(textData.isPresent()) {
			System.out.print("Yes True!!!");
		}
		
		//ifPresent
		System.out.print("\n");
		textData.ifPresent(s -> System.out.println(s+"Appended"));
		
		/*
		 * Syntax: 
		 * public void ifPresent(Consumer<? super T> consumer) { 
		 * if (value !=
		 * null) consumer.accept(value); 
		 * }
		 */
		
	}
}
