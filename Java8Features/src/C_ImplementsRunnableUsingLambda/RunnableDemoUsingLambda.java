package C_ImplementsRunnableUsingLambda;

public class RunnableDemoUsingLambda {

	public static void main(String args[]) {

		/*
		 * Using Legacy
		 */

		Runnable runnable = new Runnable() {

			public void run() {
				System.out.println("Runnbale 1");
			}
		};

		new Thread(runnable).start();
		
		
		/*
		 * Using java 8
		 */
		
		Runnable runnable_demo1 = () -> {System.out.println("Runnable 2");};
		new Thread(runnable_demo1).start();
		
		Runnable runnable_demo2 = () -> System.out.println("Runnable 3");;
		new Thread(runnable_demo2).start();
		
		new Thread( ()-> System.out.println("Runnable 4") ).start();
	}
}
