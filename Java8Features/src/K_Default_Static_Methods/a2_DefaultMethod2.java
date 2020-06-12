package K_Default_Static_Methods;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import a1_Data.Student;
import a1_Data.StudentDataBase;

public class a2_DefaultMethod2 {

	public static Consumer<Student> stConsumer = s -> System.out.println(s);
	public static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
	public static Comparator<Student> gradeComparator = Comparator.comparing(Student::getGradeLevel);

	public static void compareByName(List<Student> stList) {

		Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
		stList.sort(nameComparator);
		stList.forEach(stConsumer);
	}

	public static void compareByGpa(List<Student> stList) {

		Comparator<Student> gpaComparator = Comparator.comparing(Student::getGpa);
		stList.sort(gpaComparator);
		stList.forEach(stConsumer);
	}
	
	//Comparator Chaining function
	
	public static void comparatorChaining(List<Student> stList) {
		
		stList.sort(gradeComparator.thenComparing(nameComparator));
		stList.forEach(stConsumer);
	}
	

	public static void main(String args[]) {

		System.out.println("Before comparision:");
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(stConsumer);

		System.out.println("Comparision By name:");
		compareByName(studentList);
		
		System.out.println("Comparision By gpa:");
		compareByGpa(studentList);
		
		System.out.println("After Comparator chaining:");
		comparatorChaining(studentList);

	}
}
