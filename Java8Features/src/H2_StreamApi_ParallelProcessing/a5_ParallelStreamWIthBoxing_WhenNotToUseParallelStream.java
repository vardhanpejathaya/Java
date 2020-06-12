package H2_StreamApi_ParallelProcessing;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * When not to use parallel stream demo
 */
public class a5_ParallelStreamWIthBoxing_WhenNotToUseParallelStream {
	
	public static int sumUsingSeqStream(List<Integer> intstream) {
		long start = System.currentTimeMillis();
		int sum = intstream.stream()
		.reduce(0,(i,j) -> i+j);
		long end = System.currentTimeMillis();
		System.out.println("Duration of seq stream ==> "+(end-start));
		return sum;
	}
	
	public static int sumUsingParallelStream(List<Integer> intstream) {
		long start = System.currentTimeMillis();
		int sum = intstream.parallelStream() //each time boxing will happen here before calculating sum.
		.reduce(0,(i,j) -> i+j);
		long end = System.currentTimeMillis();
		System.out.println("Duration of parallel stream ==> "+(end-start));
		return sum;
	}

	public static void main(String args[]) {
		
		List<Integer> intstream = IntStream.rangeClosed(0, 100000)
		.boxed()//convert primitive data type to wrapper class object
		.collect(Collectors.toList());
		sumUsingSeqStream(intstream);
		sumUsingParallelStream(intstream);
		
		
		
	}
}
