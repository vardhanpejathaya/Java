package G_Streams;

import a1_Data.StudentDataBase;

/*
 * Stream operations:
 * All below methods will accept predicate as input parameter and returns the boolean value.
 * 1.allMatch(Predicate function) --> matches all the elements and return the boolean value
 * 2.anyMatch(Predicate function) --> matches for any elements and returns the boolean value
 * 3.noneMatch(Predicate function) --> opposite to allMatch.
 */

public class d1_StreamOperations_AllMatchAnyMatchNoneMatchOperations {

	//allMatch() demo
	public static boolean allMatch() {
		return StudentDataBase.getAllStudents().stream()
		.allMatch(s -> s.getGpa() >4.0);//false
		//.allMatch(s -> s.getGpa() >2.0);//trues
	}
	
	//anyMatch() demo
	public static boolean anyMatch() {
		return StudentDataBase.getAllStudents().stream()
				.anyMatch(s -> s.getGpa() >= 4);
	}
	

	//noneMatch() demo
	public static boolean noneMatch() {
		return StudentDataBase.getAllStudents().stream()
				.noneMatch(s -> s.getGpa() > 4);
	}
	
	
	public static void main(String args[]) {
		System.out.println("allMatch() demo:--> "+allMatch());//false
		System.out.println("anyMatch() demo:--> "+anyMatch());//true
		System.out.println("noneMatch() demo:--> "+noneMatch());//true
	}
}
