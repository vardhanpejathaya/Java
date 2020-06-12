package G_Streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import a1_Data.Student;
import a1_Data.StudentDataBase;

/*
 * Stream demo
 * Stream work flow:
 * stream() --> Intermediate operations -->Terminal operations
 */
public class a1_StreamDemo1 {

	public static void main(String args[]) {

		Map<String, List<String>> stdetailMap = StudentDataBase.getAllStudents().stream()//Return Map<Stream>
				//Intermediate operations
				.filter(s -> s.getGradeLevel() > 3)//Return Map<Stream>
				.filter(s -> s.getGpa() > 3.5)//Return Map<Stream>
				//Terminal operations
				.collect(Collectors.toMap(Student::getName, Student::getActivities));//Return Map<String,List<String>>

		System.out.println(stdetailMap);

		/*
		 * Parallel stream
		 */

		/*
		 * Map<String, List<String>> stdetailMap =
		 * StudentDataBase.getAllStudents().parallelStream() .filter(s ->
		 * s.getGradeLevel() > 3).filter(s -> s.getGpa() > 3.5)
		 * .collect(Collectors.toMap(Student::getName, Student::getActivities));
		 * 
		 * System.out.println(stdetailMap);
		 */
	}
}
