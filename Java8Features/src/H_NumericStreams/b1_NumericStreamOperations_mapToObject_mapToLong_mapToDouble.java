package H_NumericStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class b1_NumericStreamOperations_mapToObject_mapToLong_mapToDouble {

	/*
	 * mapToObject()
	 */
	public static List<Integer> mapToObject() {
		
		return IntStream.rangeClosed(1, 10)
		.mapToObj(i -> i)
		.collect(Collectors.toList());
		
	}
	
	/*
	 * mapToLong()
	 */
	public static Long mapToLong() {
		return IntStream.rangeClosed(1, 10)
		.mapToLong(i -> i)
		.sum();
	}
	
	/*
	 * mapToDouble
	 */
	public static Double mapToDouble() {
		return IntStream.rangeClosed(1, 10)
		.mapToDouble(i -> i)
		.sum();
	}
	
	
	public static void main(String args[]) {
		
		System.out.println("mapToObject()======> "+mapToObject());
		
		System.out.println("mapToLong()======> "+mapToLong());
		
		System.out.println("mapToDouble()======> "+mapToDouble());
	}
}
