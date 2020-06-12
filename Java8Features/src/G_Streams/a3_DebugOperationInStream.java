package G_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import a1_Data.Student;
import a1_Data.StudentDataBase;

public class a3_DebugOperationInStream {

	static Predicate<Student> p1 = s -> s.getGradeLevel() > 2.5;
	static Predicate<Student> p2 = s -> s.getGpa() > 3.5;

	public static void main(String args[]) {

		Map<String, List<String>> sdetails = StudentDataBase.getAllStudents().stream()
				.peek(s -> System.out.println("Before filter"+s))
				.filter(p1)
				.peek(s -> System.out.println("After filter 1"+s))
				.filter(p2)
				.peek(s -> System.out.println("After filter 2"+s))
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
		
		System.out.println(sdetails);
	}
	
	
}
