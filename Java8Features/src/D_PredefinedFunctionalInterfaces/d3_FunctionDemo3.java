package D_PredefinedFunctionalInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import a1_Data.Student;
import a1_Data.StudentDataBase;

/*
 * Requirements:
 *1. create the function that should accept student object and return the student name and its corresponding gpa
 *2.create the function that should accept student object and return the name and 
 *gpa for thos tudent who is having gpa is more than 3
 */
public class d3_FunctionDemo3 {

	/*
	 * 1. create the function that should accept student object and return the
	 * student name and its corresponding gpa
	 */
	static Function<List<Student>, Map<String, Double>> fun1 = students -> {

		Map<String, Double> map = new HashMap<>();

		students.forEach(student -> {
			map.put(student.getName(), student.getGpa());
		});

		return map;
	};

	/*
	 * create the function that should accept student object and return the name and
	 * gpa for those student who is having gpa is more than 3
	 */

	static Function<List<Student>, Map<String, List<String>>> fun2 = students -> {

		Map<String, List<String>> map = new HashMap<>();

		students.forEach(st -> {

			if (c1_PredicateDemo2.p2.test(st)) {
				map.put(st.getName(), st.getActivities());
			}
		});
		return map;
	};

	public static void main(String args[]) {

		System.out.println(fun1.apply(StudentDataBase.getAllStudents()));
		System.out.println("Filtered with gpa:---> " + fun2.apply(StudentDataBase.getAllStudents()));
	}
}
