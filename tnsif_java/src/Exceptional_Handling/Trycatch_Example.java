package Exceptional_Handling;

public class Trycatch_Example {

		static int performDivision(int x, int y) {
			System.out.println("I am in performDivision method");
			int z = 2;
			z = x / y;
			return z;
		}

		static float performDivision(float a, float b) {
			return a / b;
		}
	}
