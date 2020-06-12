package D_PredefinedFunctionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import a1_Data.Student;
import a1_Data.StudentDataBase;

public class c3_BiPredicateDemo1 {

	/*
	 * Predicate<Student> p1 = s -> s.getGradeLevel() >= 3; Predicate<Student> p2 =
	 * s -> s.getGpa() > 3.5;
	 */
	
	/*
	 * Replace bBi Predicate feature
	 */
	BiPredicate<Integer, Double> biPredicate = (grade,gpa) -> grade >=3 && gpa >3.5;
	
	BiConsumer<String, List<String>> c1 = (name, activities) -> System.out.println(name + ":" + activities);

	Consumer<Student> studentC = student -> {

		if (biPredicate.test(student.getGradeLevel(),student.getGpa())) {
			c1.accept(student.getName(), student.getActivities());
		}
	};

	public void printNameAndACtivities(List<Student> student) {
		student.forEach(studentC);
	}

	public static void main(String asrgs[]) {

		List<Student> studentList = StudentDataBase.getAllStudents();
		new c3_BiPredicateDemo1().printNameAndACtivities(studentList);
	}
}
