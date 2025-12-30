package tnsfc_multithread;

public class ThreadDemo {
		public static void main(String[] args) {
			ChildThread threadOne = new ChildThread(9, "First");
			ChildThread threadTwo = new ChildThread(5, "Second");

			threadOne.start();
			//threadOne.start(); // throws IllegalStateException
			// threadOne.run(); // single threaded application 
			threadTwo.start();

			System.out.println("-----------------------End of Main--------------------------");
		}
	}
