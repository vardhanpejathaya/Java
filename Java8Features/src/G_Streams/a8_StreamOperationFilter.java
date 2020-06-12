package G_Streams;

import java.util.List;
import java.util.stream.Collectors;

import a1_Data.Student;
import a1_Data.StudentDataBase;

public class a8_StreamOperationFilter {

	public static List<Student> getFilteredStudentList() {
		
		return StudentDataBase.getAllStudents().stream()//Stream<Student>
				.filter(student -> student.getGender().equalsIgnoreCase("female"))//Filtered stream of student Stream<Student>
				.filter(s -> s.getGpa()>3.8)//Stream<Student>
				.collect(Collectors.toList());//List<String>
	}
	
	public static void main(String args[]) {
		getFilteredStudentList().forEach(System.out::println);
	}
}
