package G_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import a1_Data.Student;
import a1_Data.StudentDataBase;

/*
 * reduce():
 * This is the terminal operation.
 * Used to reduce the content of the stream to the single value.
 * 
 * It takes the 2 parameter:
 * 1. First parameter::Default or initial value.
 * 2. Second parameter::BinaryOperator<T>
 * Binary operator: It should accept the 2 args having the same type and return the same type result.
 * ex: multiplication of the 2 numbers.
 */

/*
 * Get the students details who is having highest GPA.
 */

public class a9_StreamOperation_reduce_method2 {

	

	public static Optional<Student> getStDetailsHavignHihestGPA() {
		
		return StudentDataBase.getAllStudents().stream()
				.reduce((s1, s2) -> (s1.getGpa() > s2.getGpa() ? s1 : s2));
				
	};
	
	public static void main(String args[]) {
		
		if(getStDetailsHavignHihestGPA().isPresent()) {
			System.out.println(getStDetailsHavignHihestGPA().get());
		}
		
	}
}
