package H1_Streams_TerminalOperations;

import java.util.stream.Collectors;

import a1_Data.Student;
import a1_Data.StudentDataBase;

/*
 * Terminal Operations:collect()
 * summingInt(),averagingInt()
 */

public class a5_TerminalOperations_collect_summingInt_averagingInt {

	/*
	 * summingIntDemo()
	 */
	public static int summingIntDemo() {
		return StudentDataBase.getAllStudents()
		.stream()
		.collect(Collectors.summingInt(Student::getNoteBooks));
	}
	
	/*
	 * averagingInt() demo
	 */
	public static Double averagingIntDemo() {
		return StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.averagingInt(Student::getNoteBooks));
	}
	
	public static void main(String args[]) {
		
		System.out.println("summingIntDemo===> "+summingIntDemo());
		System.out.println("averagingIntDemo==> "+averagingIntDemo());
	}
}
