package H_NumericStreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/*
 * Numeric Stream Aggregate Functions:
 * max(),min(),average()
 */
public class a2_NumericStream_AggregateFunction_MaxMinAverage {

	public static void main(String args[]) {
		
		int sum= IntStream.rangeClosed(1, 59).sum();
		System.out.println("Sum of IntStream ->"+sum);
		OptionalInt max = IntStream.rangeClosed(1, 59).max();
		System.out.println("max() sample:");
		System.out.println((max.isPresent())?max.getAsInt():0);
		System.out.println("average() sample");
		OptionalDouble od = IntStream.rangeClosed(1, 50).average();
		System.out.println(od.isPresent()?od.getAsDouble():0);
	}
}
