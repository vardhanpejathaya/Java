package D_PredefinedFunctionalInterfaces;

import java.util.List;
import java.util.function.Predicate;

import a1_Data.Student;
import a1_Data.StudentDataBase;

public class c1_PredicateDemo2 {

	static List<Student> studentData = StudentDataBase.getAllStudents();
	static Predicate<Student> p1 = (student) -> (student.getGradeLevel()) >= 3;
	static Predicate<Student> p2 = (student) -> (student.getGpa()) >= 3.7;

	public static void studentbyGrade() {

		System.out.println("studentbyGrade******************************");
		studentData.forEach(s -> {
			if (p1.test(s)) {
				System.out.println(s);
			}
		});
	}

	public static void studentByGPA() {
		System.out.println("studentByGPA******************************");
		studentData.forEach(

				s -> {
					if (p2.test(s)) {
						System.out.println(s);
					}
				});
	}
	
	public static void studentbyGradeAndGPA() {
		System.out.println("studentbyGradeAndGPA******************************");
		studentData.forEach(
				student -> {
					if(p1.or(p2).negate().test(student)) {
						System.out.println(student);
					}
				}
		);
		
	}

	public static void main(String args[]) {
		studentbyGrade();
		studentByGPA();
		studentbyGradeAndGPA();
	}
}
