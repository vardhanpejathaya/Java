package D_PredefinedFunctionalInterfaces;

import java.util.List;
import java.util.function.Consumer;

import a1_Data.Student;
import a1_Data.StudentDataBase;

public class a_ConsumerDemo1 {

	
	static Consumer<Student> nameC = (student) -> System.out.println(student.getName());
	static Consumer<Student> displayImpl = (student) -> System.out.println(student);
	static Consumer<Student> activityC = (student) -> System.out.println(student.getActivities());
	
	/*
	 * print all the student list data
	 */
	public static void printAllStudentData() {
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(displayImpl);

	}

	/*
	 * print student name and activities
	 */

	public static void printStudentNameAndActivities() {
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(nameC.andThen(activityC));

	}

	/*
	 * print the student name whose grade is greater than 3.5
	 */
	
	public static void printStudentWithGradeFilter() {
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach( (s) -> {
			if(s.getGradeLevel()>3 && s.getGpa() > 3) {
				nameC.andThen(activityC).accept(s);
			}
		} );
		
	}

	public static void main(String args[]) {

		Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
		c1.accept("java8");

		/*
		 * Print all student data
		 */
		System.out.println("All student data:");
		printAllStudentData();

		/*
		 * print name and activities
		 */
		System.out.println("All student name and activities:");
		printStudentNameAndActivities();
		
		System.out.println("\n\nAll student whose grade is greater than 3.5:");
		printStudentWithGradeFilter();
	}
}
