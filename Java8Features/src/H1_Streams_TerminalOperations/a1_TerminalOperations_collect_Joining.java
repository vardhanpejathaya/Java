package H1_Streams_TerminalOperations;

import java.util.stream.Collectors;

import a1_Data.Student;
import a1_Data.StudentDataBase;

/*
 * Terminal operation:collect()
 * joining()
 */

public class a1_TerminalOperations_collect_Joining {

	public static String joining_1() {
		return StudentDataBase.getAllStudents().stream()//Stream<Student>
				.map(Student::getName)//Stream<String>
				.collect(Collectors.joining());//String array
	}
	
	public static String joining_2() {
		return StudentDataBase.getAllStudents().stream()//Stream<Student>
				.map(Student::getName)//Stream<String>
				.collect(Collectors.joining("-"));//String array
	}
	
	public static String joining_3() {
		return StudentDataBase.getAllStudents().stream()//Stream<Student>
				.map(Student::getName)//Stream<String>
				.collect(Collectors.joining("-","(",")"));//String array
	}
	
	public static void main(String args[]) {
		
		System.out.println("joining_1() ---> "+joining_1());
		System.out.println("joining_2() ---> "+joining_2());
		System.out.println("joining_3() ---> "+joining_3());
	}
}
