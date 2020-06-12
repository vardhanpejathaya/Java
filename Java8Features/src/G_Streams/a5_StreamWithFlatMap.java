package G_Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import a1_Data.Student;
import a1_Data.StudentDataBase;

/*
 * flatMap(): Which is same like map(),used in the context of stream, where each element in the stream represents the 
 * multiple elements.
 * where multiple elements like:
 * Stream<List>
 * Stream<Set>
 * In our example: To convert the Stream<List<String>> to Stream<String>.
 */

public class a5_StreamWithFlatMap {

	public static List<String> getAllStudentActivities() {
		
		List<String> getSA = StudentDataBase.getAllStudents().stream()//Stream<Student>
				.map(Student::getActivities)//Stream<List<String>>
				.flatMap(List::stream)//Stream<String>
				//without flat map error: Type mismatch: cannot convert from List<List<String>> to List<String>
				.collect(Collectors.toList());//List<String>
		
		return getSA;
				
	}
	
	public static void main(String args[]) {
		
	}
}
