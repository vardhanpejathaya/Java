package G_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import a1_Data.Student;
import a1_Data.StudentDataBase;

public class a2_CollectionVsStream {

	public static void main(String args[]) {

		List<String> names = Arrays.asList("var","ram","krishna");
		
		for(String name:names) {
			System.out.println(name);
		}
		
		for(String name:names) {
			System.out.println(name);
		}
		
		Stream<String> namesDetails=  names.stream();
		System.out.println("Using stream1");
		namesDetails.forEach(System.out::println);
		System.out.println("Using stream2");
		//If we use again stream then we will get below exception
		//Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
		namesDetails.forEach(System.out::println);
	
	}
}
