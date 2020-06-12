package H1_Streams_TerminalOperations;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import static java.util.stream.Collectors.*;

import a1_Data.Student;
import a1_Data.StudentDataBase;

/*
 * Terminal operations:
 * gropingBy()
 * minBy(),maxBy(),CollectingAndThen()
 */

public class a9_TerminalOperations_collect_groupingBy_4_method {

	//Collect max gpa student details in each grade.
	public static void collectMaxGpaStudent() {
		Map<Integer, Optional<Student>> maxGPAStudentDetails= StudentDataBase.getAllStudents()
		.stream()
		.collect(groupingBy(Student::getGradeLevel,maxBy(Comparator.comparing(Student::getGpa))));
		System.out.println(maxGPAStudentDetails);
	}
	
	//Collect max gpa student details in each grade without optional in the result.
	public static void collectMaxGpaStudentwithoutOptional() {
		Map<Integer,Student> maxGPAStudentDetails_withoutOptional = 
		StudentDataBase.getAllStudents()
		.stream()//Stream<Student>
		.collect(
				groupingBy(
						Student::getGradeLevel,
						collectingAndThen(
								maxBy(Comparator.comparing(Student::getGpa)), Optional::get)
				)
				
		);
		
		System.out.println(maxGPAStudentDetails_withoutOptional);
	}
	
	//Collect min gpa student details in each grade without optional in the result.
	
		public static void collectMinGpaStudentwithoutOptional() {
			Map<Integer,Student> minGPAStudentDetails_withoutOptional =
			StudentDataBase.getAllStudents()
			.stream()
			.collect(
					groupingBy(Student::getGradeLevel
					,collectingAndThen(minBy(Comparator.comparing(Student::getGpa)), Optional::get)
					)
			);
			
			System.out.println(minGPAStudentDetails_withoutOptional);
		}
	
	public static void main(String args[]) {
		
		//collectMaxGpaStudent();
		//collectMaxGpaStudentwithoutOptional();
		collectMinGpaStudentwithoutOptional();
	}
}
