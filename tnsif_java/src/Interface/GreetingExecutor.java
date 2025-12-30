package Interface;

public class GreetingExecutor {

		

		public static void main(String[] args) {
			
			//lambda expression
			
			Greeting gd = () -> {
				System.out.println("Hi Everyone!! Welcome to the Java Session");
			};
			
			gd.greet();
			

		}

	}
