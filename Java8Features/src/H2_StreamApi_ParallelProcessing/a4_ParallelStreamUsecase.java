package H2_StreamApi_ParallelProcessing;

import java.util.List;
import java.util.stream.Collectors;

import a1_Data.Student;
import a1_Data.StudentDataBase;

public class a4_ParallelStreamUsecase {

	public static List<String> fetchUsingSequentialStream() {
		long startTime = System.currentTimeMillis();
		List<String> st =  StudentDataBase.getAllStudents()
		.stream()//Stream<Student>
		.map(Student::getActivities)//Stream<List<String>>
		.flatMap(List::stream)//without flatmap: Type mismatch: cannot convert from List<List<String>> to List<String>
		.collect(Collectors.toList());
		long endTime = System.currentTimeMillis();
		System.out.println("Duration of sequential stream => "+ (endTime-startTime));
		return st;
		
	}
	
	public static List<String> fetchUsingParallelStream() {
		long startTime = System.currentTimeMillis();
		List<String> st =  StudentDataBase.getAllStudents()
		//.stream()//Stream<Student>
		.parallelStream()
		.map(Student::getActivities)//Stream<List<String>>
		.flatMap(List::stream)//without flatmap: Type mismatch: cannot convert from List<List<String>> to List<String>
		.collect(Collectors.toList());
		long endTime = System.currentTimeMillis();
		System.out.println("Duration of Parallel stream => "+ (endTime-startTime));
		return st;
		
	}
	
	public  static void main(String[] args) {
		fetchUsingSequentialStream();
		fetchUsingParallelStream();
	}
}
