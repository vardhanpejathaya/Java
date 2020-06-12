package H2_StreamApi_ParallelProcessing;

import java.util.stream.IntStream;

public class b1_ParallelStreamWIthMutableObject_WhenDoNotUse {

	public static void main(String args[]) {
		b2_SumCalculate sums = new b2_SumCalculate();
		
		IntStream.rangeClosed(1, 10000)
		//.parallel()//Result will vary every time for mutable object
		.forEach(sums::doSum);
		
		System.out.println(sums.getSum());
		
		//Using Stream:
		//Actual o/p: 50005000
		//o/p:50005000
		
		//Using parallel stream:(Every time result will vary with parallel())
		//o/p:45493656
		//o/p:29586232
		//o/p:30157517
		//o/p:30706217
		
	}
}
