package G_Streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import a1_Data.Student;
import a1_Data.StudentDataBase;

/*
 * Map: If we want to process the each object in the collection then we should got for map
 * Filter: If we want to process the collection object by any filter then we can go for Filter.
 */
public class a4_StreamsWithMap_1 {

	public static List<String> getStudentList() {

		List<String> slist = StudentDataBase.getAllStudents().stream()//Stream<Student>
				.map(Student::getName).map(String::toUpperCase)//Stream<String>-->Intermediate operations
				.collect(Collectors.toList());//List<String>-->Terminal operation

		return slist;
	}

	public static Set<String> getStudentSet() {

		Set<String> sset = StudentDataBase.getAllStudents().stream().map(Student::getName).map(String::toUpperCase)
				.collect(Collectors.toSet());

		return sset;
	}

	public static void main(String args[]) {

		System.out.println(getStudentList());
		System.out.println(getStudentSet());
	}
}
