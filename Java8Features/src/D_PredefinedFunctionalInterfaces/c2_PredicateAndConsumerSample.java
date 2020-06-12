package D_PredefinedFunctionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

import a1_Data.Student;
import a1_Data.StudentDataBase;

public class c2_PredicateAndConsumerSample {

	Predicate<Student> p1 = s -> s.getGradeLevel() >= 3;
	Predicate<Student> p2 = s -> s.getGpa() > 3.5;

	BiConsumer<String, List<String>> c1 = (name, activities) -> System.out.println(name + ":" + activities);

	Consumer<Student> studentC = student -> {

		if (p1.and(p2).test(student)) {
			c1.accept(student.getName(), student.getActivities());
		}
	};

	public void printNameAndACtivities(List<Student> student) {
		student.forEach(studentC);
	}
	
	
	public static void main(String asrgs[]) {

		List<Student> studentList = StudentDataBase.getAllStudents();
		new c2_PredicateAndConsumerSample().printNameAndACtivities(studentList);
	}
}
