package user_input;

public class Wrapperclass {


		public static void main(String[] args) {
		
			//primitive into object --> autoboxing 

			
			int x = 50;
			
			Integer y = Integer.valueOf(x);
			
			
			System.out.println(y);
			
			
			// object into primitive --> unboxing
			
			int z = y;
			
			System.out.println(z);

		}

	}
