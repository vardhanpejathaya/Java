package D_PredefinedFunctionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;

import a1_Data.Student;
import a1_Data.StudentDataBase;

public class b_BiconsumerDemo1 {

	public static void demo1() {

		BiConsumer<String, String> bc = (s1, s2) -> System.out.println(s1 + s2);
		bc.accept("vardhan", "rp");
	}

	public static void demo2() {
		BiConsumer<Integer, Integer> multiply = (i, j) -> System.out.println(i * j);
		BiConsumer<Integer, Integer> devision = (i, j) -> System.out.println(i / j);
		multiply.andThen(devision).accept(4, 2);
	}

	public static void demo3() {
		List<Student> student = StudentDataBase.getAllStudents();

		BiConsumer<String, List<String>> bc = (name, activities) -> System.out.println(name + " ->" + activities);

		student.forEach((st) -> bc.accept(st.getName(), st.getActivities()));

	}

	public static void main(String args[]) {

		demo1();
		demo2();
		demo3();
	}
}
