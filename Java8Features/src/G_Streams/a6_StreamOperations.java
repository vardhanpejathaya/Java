package G_Streams;

import java.util.List;
import java.util.stream.Collectors;

import a1_Data.Student;
import a1_Data.StudentDataBase;

/*
 * Stream operations:
 * 1.distinct() --> Return the stream object with unique elements.
 * 2.count() --> Return the counts of the stream elements.
 * 3.sorted() --> Return the stream with sorted element.
 */

public class a6_StreamOperations {

	/*
	 * 1. distinct() usecase
	 */
	public static List<String> getStudentActivitiesWithdistinct() {
		
		List<String> studentActivityList = StudentDataBase.getAllStudents().stream()
		.map(student -> student.getActivities())
		//without flatmap: Type mismatch: cannot convert from List<List<String>> to List<Student>
		.flatMap(List::stream)
		.distinct()
		.collect(Collectors.toList());
		
		return studentActivityList;
	}
	
	/*
	 * 2.count() usecase
	 */
	public static long getStudentActivitiesWithCountUsecase() {
			
			long count = StudentDataBase.getAllStudents().stream()
			.map(student -> student.getActivities())
			//without flatmap: Type mismatch: cannot convert from List<List<String>> to List<Student>
			.flatMap(List::stream)
			.distinct()
			.count();
			
			return count;
		}
	
	/*
	 * 3.sorted() usecase
	 */
	public static List<String> getStudentActivitiesWithSortedUsecase() {
		
		List<String> StudentActivitiesWithSortedUsecase = StudentDataBase.getAllStudents().stream()
		.map(student -> student.getActivities())
		//without flatmap: Type mismatch: cannot convert from List<List<String>> to List<Student>
		.flatMap(List::stream)
		.distinct()
		.sorted()
		//.sorted((s1,s2) -> - s1.compareTo(s2))
		.collect(Collectors.toList());
		
		return StudentActivitiesWithSortedUsecase;
	}
	
	public static void main(String args[]) {
		
		System.out.println("distinct() --> usecase "+getStudentActivitiesWithdistinct());
		System.out.println("count() --> usecase "+getStudentActivitiesWithCountUsecase());
		System.out.println("sorted() --usecase "+getStudentActivitiesWithSortedUsecase());
	}
}
