package H_NumericStreams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/*
 * IntStream,LongStream,DoubleStream,range(),rangeCLosed(),count(),forEach()
 */
public class a1_NumericStream_range_rangeclosed_foreach_count {

	public static void main(String args[]) {
		
		//IntStream
		System.out.println("IntStream range()");
		IntStream intStream = IntStream.range(1, 50);
		System.out.println("range count InputStream-->"+intStream.count());
		IntStream.range(1, 50).forEach(val -> System.out.print(val+","));
		
		System.out.println("\n");
		System.out.println("IntStream rangeClosed()");
		IntStream intStream_rangeclosed = IntStream.rangeClosed(1, 50);
		System.out.println("range_closed count IntputStream rangeclosed--> "+intStream_rangeclosed.count());
		IntStream.rangeClosed(1, 50).forEach(val -> System.out.print(val+","));
		
		//LongStream
		System.out.println("\n");
		System.out.println("LongStream range()");
		LongStream longStream = LongStream.range(1, 50);
		System.out.println("range count LongStream-->"+longStream.count());
		LongStream.range(1, 50).forEach(val -> System.out.print(val+","));
		
		System.out.println("\n");
		System.out.println("LongStream rangeClosed()");
		LongStream longStream_rangeclosed = LongStream.rangeClosed(1, 50);
		System.out.println("range_closed count IntputStream rangeclosed--> "+longStream_rangeclosed.count());
		LongStream.rangeClosed(1, 50).forEach(val -> System.out.print(val+","));
		
		//DoubleStream
		System.out.println("\n");
		System.out.println("DoubleStream()");
		IntStream.range(1, 50).asDoubleStream().forEach(v -> System.out.print(v+","));
		
		
	}
}
