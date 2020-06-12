package H1_Streams_TerminalOperations;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import a1_Data.Student;
import a1_Data.StudentDataBase;

/*
 *  public static <T, K, D, A, M extends Map<K, D>>
    Collector<T, ?, M> groupingBy(Function<? super T, ? extends K> classifier,
                                  Supplier<M> mapFactory,
                                  Collector<? super T, A, D> downstream) {}
 */

public class a8_TerminalOperations_collect_groupingBy_3_method {

	public static void groupingBy3Sets() {

		LinkedHashMap<String, Set<Student>> Three_sets_of_data = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getName, LinkedHashMap::new, Collectors.toSet()));
		
		System.out.println(Three_sets_of_data);
	}

	public static void main(String args[]) {
		groupingBy3Sets();
	}
}
