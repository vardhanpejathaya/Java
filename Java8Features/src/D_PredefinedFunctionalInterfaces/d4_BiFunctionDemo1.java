package D_PredefinedFunctionalInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import a1_Data.Student;
import a1_Data.StudentDataBase;

/*
 * Requirements:
 * Create the function that should accept the student object and some predicate 
 * and return the map object with student name and gpa
 */
public class d4_BiFunctionDemo1 {

	static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> bifun1 = (students, p) -> {

		Map<String, Double> map = new HashMap<>();

		students.forEach(

				st -> {
					if (p.test(st)) {
						map.put(st.getName(), st.getGpa());
					}
				});

		return map;

	};

	public static void main(String args[]) {

		System.out.println(bifun1.apply(StudentDataBase.getAllStudents(), c1_PredicateDemo2.p1));
	}
}
