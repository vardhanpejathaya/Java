package H1_Streams_TerminalOperations;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import a1_Data.Student;
import a1_Data.StudentDataBase;

/*
 * Terminal operations:collect()
 * maxBy()
 * minBy()
 */

public class a4_TerminalOperations_collect_maxBy_minBy {

	public static Optional<Student> maxBySample() {
		return StudentDataBase.getAllStudents()
		.stream()
		.collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
	}
	
	
	public static Optional<Student> minBySample() {
		return StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
	}
	
	public static List<String> minByNormalComparator() {
		return StudentDataBase.getAllStudents()
				.stream()
				.map(Student::getName)
				.sorted((s1,s2) -> -s1.compareTo(s2))
				.collect(Collectors.toList());
	}
	
	public static void main(String args[]) {
		
		System.out.println("maxBySample()========> "+maxBySample());
		System.out.println("minBySample()========> "+minBySample());
		System.out.println("minByNormalComparator()===>"+minByNormalComparator());
	}
}
