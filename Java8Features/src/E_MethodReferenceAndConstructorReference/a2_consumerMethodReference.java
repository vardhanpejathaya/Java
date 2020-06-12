package E_MethodReferenceAndConstructorReference;

import java.util.function.Consumer;

import a1_Data.Student;
import a1_Data.StudentDataBase;

public class a2_consumerMethodReference {

	/*
	 * Using lambda
	 */
	static Consumer<Student> displayImpl = (student) -> System.out.println(student);

	/*
	 * Using method reference 1
	 */

	static Consumer<Student> mref = System.out::println;
	
	/*
	 * using method reference 2
	 */
	static Consumer<Student> mref2 = Student::printListOfActivities;
	

	public static void main(String args[]) {

		StudentDataBase.getAllStudents().forEach(displayImpl);
		
		StudentDataBase.getAllStudents().forEach(mref);
		
		StudentDataBase.getAllStudents().forEach(mref2);

	}
}
