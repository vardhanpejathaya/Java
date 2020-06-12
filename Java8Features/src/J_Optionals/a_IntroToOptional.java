package J_Optionals;

import java.util.Optional;

import a1_Data.Student;
import a1_Data.StudentDataBase;

public class a_IntroToOptional {

	public static String getStudentName() {
		Student name =  StudentDataBase.studentSupplier.get();
		if(name != null) {
			return name.getName();
		}
		return null;
	}
	
	
	/*
	 * Optional usecase
	 */
	public static Optional<String> getStudentNameWithOptional() {

		//Optional<Student> name = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		//if value is null it wont throw nullable exception
		Optional<Student> name = Optional.ofNullable(null);

		if (name.isPresent()) {
			return name.map(Student::getName);
		} else {
			return Optional.empty();
		}

	}
	 
	
	public static void main(String args[]) {
		
		//System.out.println(getStudentName().length());
		
		if(getStudentNameWithOptional().isPresent()) {
			System.out.println(getStudentNameWithOptional().get().length());
		} else {
			System.out.println("String is null");
		}
	}
}
