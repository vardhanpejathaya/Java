package H1_Streams_TerminalOperations;

import static java.util.stream.Collectors.*;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

import a1_Data.Student;
import a1_Data.StudentDataBase;

/*
 * 1.Single argument
 * public static <T>
    Collector<T, ?, Map<Boolean, List<T>>> partitioningBy(Predicate<? super T> predicate) {
        return partitioningBy(predicate, toList());
    }
  
  2.Double argument
   public static <T, D, A>
    Collector<T, ?, Map<Boolean, D>> partitioningBy(Predicate<? super T> predicate,
                                                    Collector<? super T, A, D> downstream) {}  
 */

/*
 * Single arument
 */
public class b1_TerminalOperations_collect_partitioning_demo {

	public static Predicate<Student> p1 = s -> s.getGpa() > 3.8;
	
	public static void partitioningDemo1() {
		Map<Boolean, List<Student>> p1dempvals =  StudentDataBase.getAllStudents()
		.stream()
		.collect(partitioningBy(p1));
		
		System.out.println(p1dempvals);
	}
	
	/*
	 * Double argument
	 */
	public static void partitioningDemo2() {
		Map<Boolean, Set<Student>> p1dempvals2 =  StudentDataBase.getAllStudents()
		.stream()
		.collect(partitioningBy(p1,toSet()));
		
		System.out.println(p1dempvals2);
	}
	
	public static void main(String args[]) {
		
		//partitioningDemo1();
		partitioningDemo2();
	}
}
