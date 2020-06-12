package D_PredefinedFunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import a1_Data.Student;
import a1_Data.StudentDataBase;

/*
 * Supplier functional interface:
 * which will take only return type and does not take any input data type.
 */
public class f_SuplierDemo {

	public static void main(String args[]) {

		/*
		 * Get student data
		 */
		Supplier<Student> supdemo1 = () -> new Student("Adam", 2, 4.0, "male",
				Arrays.asList("swimming", "basketball", "volleyball"));

		/*
		 * Get all student data
		 */
		Supplier<List<Student>> supdemo2 = () -> StudentDataBase.getAllStudents();

		System.out.println("Student data---->" + supdemo1.get());

		System.out.println("Get all student data -->" + supdemo2.get());
	}
}
