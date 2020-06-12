package H1_Streams_TerminalOperations;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import a1_Data.Student;
import a1_Data.StudentDataBase;

public class a7_TerminalOperations_collect_groupingBy_2_method {

	/*
	 * syntax:
	 *  public static <T, K, A, D>
    Collector<T, ?, Map<K, D>> groupingBy(Function<? super T, ? extends K> classifier,
                                          Collector<? super T, A, D> downstream) {
        return groupingBy(classifier, HashMap::new, downstream);
    }
	 */
	public static void two_Level_Grouping() {
		Map<Integer, Map<String, List<Student>>> std_grdlevel = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel,
						Collectors.groupingBy(s -> s.getGpa() > 3.8 ? "GOOD" : "BAD")));

		System.out.println(std_grdlevel);
	}

	/*
	 *  public static <T, K, A, D>
    Collector<T, ?, Map<K, D>> groupingBy(Function<? super T, ? extends K> classifier,
                                          Collector<? super T, A, D> downstream) {
        return groupingBy(classifier, HashMap::new, downstream);
    }
	 */
	
	public static void groupingBy_sum() {

		Map<Integer, Integer> s_sum_details = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.summingInt(Student::getNoteBooks)));
		System.out.println(s_sum_details);
	}

	public static void main(String args[]) {

		//two_Level_Grouping();
		groupingBy_sum();

	}
}
