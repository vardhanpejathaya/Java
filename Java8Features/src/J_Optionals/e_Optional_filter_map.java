package J_Optionals;

import java.util.Optional;

import a1_Data.Student;
import a1_Data.StudentDataBase;

public class e_Optional_filter_map {

	//filter with optional
	public static void filterWithOptional() {
		Optional<Student> optionalStudent =  Optional.ofNullable(StudentDataBase.studentSupplier.get());
		
		if(optionalStudent.isPresent()) {
			optionalStudent
			.filter(s -> s.getGpa() > 1)
			.ifPresent(s -> System.out.println(s.getName()));
		}
	}
	
	//map with optional
	public static void mapWithOptional() {
		Optional<Student> optionalStudent =  Optional.ofNullable(StudentDataBase.studentSupplier.get());
		if(optionalStudent.isPresent()) {
			
			Optional<String>  studentDetails =  optionalStudent
			.filter(s -> s.getGpa() > 1)
			.map(Student::getName);
			
			System.out.println(studentDetails.get());
		}
		
	}
	
	public static void main(String args[]) {
		filterWithOptional();
		mapWithOptional();
	}
}
