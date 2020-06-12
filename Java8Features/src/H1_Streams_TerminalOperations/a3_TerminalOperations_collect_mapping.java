package H1_Streams_TerminalOperations;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import a1_Data.Student;
import a1_Data.StudentDataBase;

/*
 * Terminal operations: collect()
 * mapping()
 */

public class a3_TerminalOperations_collect_mapping {

	
	public static void main(String args[]) {
		
		List<String> mappedData= StudentDataBase.getAllStudents()
				.stream()
		        .collect(Collectors.mapping(Student::getName, Collectors.toList()));
		
		System.out.println("mappedData======> "+mappedData);
		
		Set<String> mappedSetData=  StudentDataBase.getAllStudents()
		.stream()
		.collect(Collectors.mapping(Student::getName, Collectors.toSet()));
		System.out.println("mappedSetData =====>"+mappedSetData);
	}
}
