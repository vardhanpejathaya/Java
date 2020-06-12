package H1_Streams_TerminalOperations;

import java.io.ObjectInputStream.GetField;
import java.util.stream.Collectors;

import a1_Data.StudentDataBase;

/*
 * Terminal operation:collect()
 * counting()
 */
public class a2_TerminalOperations_collect_counting {

	public static long getCountOfStudent() {
		return StudentDataBase.getAllStudents().stream()//Stream<Student>
		.collect(Collectors.counting());
	}
	
	public static long getCountOfStudentwithFilter() {
		return StudentDataBase.getAllStudents().stream()//Stream<Student>
				.filter(s -> s.getGpa()>3.9)
		.collect(Collectors.counting());
	}
	
	public static void main(String args[]) {
		
		System.out.println("Count of student data without filter: ===> "+getCountOfStudent());
		System.out.println("Count of student data with filter: ===> "+getCountOfStudentwithFilter());
		
	}
}
