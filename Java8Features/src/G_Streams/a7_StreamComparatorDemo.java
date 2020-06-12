package G_Streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import a1_Data.Student;
import a1_Data.StudentDataBase;

public class a7_StreamComparatorDemo {

	public static List<Student> getSortedLisByName() {

		return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getName))
				.collect(Collectors.toList());
	}

	public static List<Student> getSortedLisByNamereverse() {

		return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getName).reversed())
				.collect(Collectors.toList());
	}

	public static List<Student> getSortedListByGPA() {

		return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getGpa))
				.collect(Collectors.toList());
	}

	public static List<Student> getSortedListByGPAReverse() {

		return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getGpa).reversed())
				.collect(Collectors.toList());
	}

	public static void main(String args[]) {

		// sorted by name
		System.out.println("Names in alphabetical order :::");
		getSortedLisByName().forEach(System.out::println);

		// sorted by name in reverse order
		System.out.println("Names in reverse order:::");
		getSortedLisByNamereverse().forEach(System.out::println);

		// sorted by gpa numeric order ascending
		System.out.println("GPA in acsending order:::");
		getSortedListByGPA().forEach(System.out::println);

		// sorted by gpa numeric order ascending
		System.out.println("GPA in acsending order Reversed:::");
		getSortedListByGPAReverse().forEach(System.out::println);
	}
}
