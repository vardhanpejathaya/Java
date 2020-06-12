package G_Streams;

import a1_Data.Student;
import a1_Data.StudentDataBase;

public class a9_StreamReduceMapExample3 {

	public static int getTotalNotebookCount() {
		
		int countOfNotebooks = StudentDataBase.getAllStudents().stream()
		//.map(s -> s.getNoteBooks())
		.map(Student::getNoteBooks)	
		//.reduce(0,(a,b)->a+b);
		//alternative method:
		.reduce(0,Integer::sum);
		
		return countOfNotebooks;
	}
	
	public static void main(String args[]) {
		System.out.println(getTotalNotebookCount());
	}
}
