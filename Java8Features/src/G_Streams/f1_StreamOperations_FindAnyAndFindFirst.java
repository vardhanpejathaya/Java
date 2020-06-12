package G_Streams;

import java.util.Optional;

import a1_Data.Student;
import a1_Data.StudentDataBase;

/*
 * findAny() and findFirst() operations
 * Both operations are return the results of type Optional.
 * findAny()--> find the first encountered element in the stream
 * findFirst() --> returns the first element in the stream.
 */

public class f1_StreamOperations_FindAnyAndFindFirst {

	public static Optional<Student> findAnyDemo() {
		
		return StudentDataBase.getAllStudents().stream()
		.filter(s -> s.getGpa()>= 3.8)
		.findAny();
	}
	
	public static Optional<Student> findFirstDemo() {
		return StudentDataBase.getAllStudents().stream()
				.filter(s->s.getGpa()>=4)
				.findFirst();
	}
	
	public static void main(String args[]) {
		
		System.out.println("findAnyDemo");
		if(findAnyDemo().isPresent()) {
			System.out.println(findAnyDemo().get());
		} else {
			System.out.println("Empty data");
		}
		
		System.out.println("FindFirst demo:");
		if(findFirstDemo().isPresent()) {
			System.out.println(findFirstDemo().get());
		} else {
			System.out.println("Empty data");
		}
	}
}
