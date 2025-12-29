package Exceptional_Handling;

public class Trycatch {
		public static void main(String[] args) {
			System.out.println("I am in main method");
			int result;
			try {

				result = Trycatch_Example.performDivision(21, 0);
				if (result != 0)
					System.out.println("Divisin is " + result);

				System.out.println("------------------------------");

				result = Trycatch_Example.performDivision(12, 3);
				if (result != 0)
					System.out.println("Division is " + result);

				System.out.println("------------------------------");
			} catch (ArithmeticException e) {
				System.out.println("I am in catch block: " + e.getMessage());
				
				e.printStackTrace();
			}
			System.out.println(Trycatch_Example.performDivision(21f, 9f));

			System.out.println("------------------------------");
			System.out.println(Trycatch_Example.performDivision(12f, 0f));

		}
	}