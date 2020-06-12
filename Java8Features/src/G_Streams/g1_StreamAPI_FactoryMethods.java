package G_Streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/*
 * Factory methods in the Stream:
 * Stream.of()-->which is used to create the stream for group of values
 * Stream.iterate(1,x->x*2)
 * Stream.generate(Supplier) -->It will take supplier as input parameter.
 */
public class g1_StreamAPI_FactoryMethods {

	public static void main(String args[]) {
		
		/*
		 * Stream.of() method
		 * Stream<T> of(T... values)
		 */
		System.out.println("Stream.of() method");
		Stream<String> ofvalues = Stream.of("Vardhan","a","b","c");
		ofvalues.forEach(System.out::println);
		
		/*
		 * Stream.iterate() method
		 * iterate(final T seed, final UnaryOperator<T> f)
		 */
		System.out.println("Stream.iterate() method");
		Stream.iterate(1, x->x*2)
		.limit(10)
		.forEach(System.out::println);
		
		
		/*
		 * Stream.generate() method
		 * Stream<T> generate(Supplier<T> s)
		 */
		System.out.println("Stream.generate() method");
		Supplier<Integer> sup = new Random()::nextInt;
		Stream.generate(sup)
		.limit(5)
		.forEach(System.out::println);;
	}
}
