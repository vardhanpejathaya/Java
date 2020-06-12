package H1_Streams_TerminalOperations;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import a1_Data.Student;
import a1_Data.StudentDataBase;

/*
 * Terminal operation: collect()
 * groupingBy()
 */

public class a6_TerminalOperations_collect_groupingBy_1_method {

	/*
	 * syntax:
	 * public static <T, K> Collector<T, ?, Map<K, List<T>>>
    groupingBy(Function<? super T, ? extends K> classifier) {
        return groupingBy(classifier, toList());
    }

	 */
	public static void groupingByDemo() {
		Map<String, List<Student>> studentData= StudentDataBase.getAllStudents()
		.stream()//Stream<Student>
		.collect(Collectors.groupingBy(Student::getGender));
		
		System.out.print("groupingByDemo====> "+studentData);
	}
	
	public static void CustomizedGroupingDemo() {
		
		Map<String, List<Student>> cdata= StudentDataBase.getAllStudents()
		.stream()//Stream<Student>
		.collect(Collectors.groupingBy(s -> s.getGpa()>3.8? "GOOD":"BAD"));
		
		for(Map.Entry<String, List<Student>> sdata : cdata.entrySet()) {
			
			for(Student st: sdata.getValue()) {
				System.out.println(sdata.getKey() +"===>"+st.getName());
			}
		}
		
	}
	
	public static void main(String args[]) {
		//groupingByDemo();
		CustomizedGroupingDemo();
	}
}
