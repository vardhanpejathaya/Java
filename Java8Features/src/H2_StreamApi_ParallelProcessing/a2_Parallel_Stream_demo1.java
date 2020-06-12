package H2_StreamApi_ParallelProcessing;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class a2_Parallel_Stream_demo1 {

	public static long checkPerformance(Supplier<Integer> suplier, int numberOfTimes) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < numberOfTimes; i++) {
			suplier.get();
		}
		long endTime = System.currentTimeMillis();
		return endTime - startTime;
	}

	public static int sequential_stream_sum() {
		return IntStream.rangeClosed(1, 1000000).sum();// Sequential stream
	}

	public static int parallel_stream_sum() {
		return IntStream.rangeClosed(1, 1000000).parallel()// Splitting the stream into multiple parts(Parallel Stream).
				.sum();
	}

	public static void main(String args[]) {

		System.out.println("Performance of the sequential Stream: "
				+ checkPerformance(a2_Parallel_Stream_demo1::sequential_stream_sum, 20));
		System.out.println("Performance of the parallel Stream: "
				+ checkPerformance(a2_Parallel_Stream_demo1::parallel_stream_sum, 20));
	}
}
