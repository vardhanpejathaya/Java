package J_Optionals;

import java.util.Optional;

import a1_Data.Student;
import a1_Data.StudentDataBase;

public class c_Optional_orElese_orElseGet_orElseThrow {

	//orElse
	public static String orElse() {
		
		Optional<Student> name = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		//Optional<Student> name = Optional.ofNullable(null);
		return name.map(Student::getName).orElse("defaultName");//orElse: Here we should pass default string
	
		
	}
	
	//orElseGet
	public static String orElseGet() {
		  Optional<Student> name = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		//Optional<Student> name = Optional.ofNullable(null);
		
		return name.map(Student::getName).orElseGet(()->"Default val");//orElseGet: Here we should pass default value as Supplier, not default string(diff between orElse and orElseGet)
	}
	
	//orElseThrow
	public static String orElseThrow() {
		Optional<Student> name = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		//Optional<Student> name = Optional.ofNullable(null);
		return name.map(Student::getName).orElseThrow( () -> new RuntimeException("Not valid data"));
		//Pass Exception as Supplier
	}
	
	
	public static void main(String args[]) {
		
		System.out.println("orElse ----- "+orElse());
		//o/p: orElse ----- defaultName, orElse ----- Adams
		
		System.out.println("orElseGet ----- "+orElseGet());
		// o/p:orElseGet ----- Adams, orElseGet ----- Default val
		
		System.out.println("orElseThrow ----- "+orElseThrow());
		//o/p: orElseThrow ----- Adams, for null:  Not valid data
	}
}
