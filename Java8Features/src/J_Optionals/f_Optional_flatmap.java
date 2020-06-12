package J_Optionals;

import java.util.Optional;

import a1_Data.Bike;
import a1_Data.Student;
import a1_Data.StudentDataBase;

public class f_Optional_flatmap {

	//FlatMap
	public static void OptionalFlatMap() {
		Optional<Student> optionalStudent = StudentDataBase.getOptionalStudent();
			
			Optional<String> bikeName = optionalStudent
			.filter(s -> s.getGpa() > 3)//Optional<Student Optional<bike>>
			.flatMap(Student::getBike)//Optional<Bike>
			.map(Bike::getName);
			
		if(bikeName.isPresent()) {
			System.out.println(bikeName.get());//Client123

		}
		
		
	}
	
	public static void main(String args[]) {
		OptionalFlatMap();
	}
}
