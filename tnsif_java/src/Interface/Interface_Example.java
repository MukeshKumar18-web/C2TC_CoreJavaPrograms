package Interface;

	interface Fruits{
		
		 void sweet() ; //declaration
		 
		 //void sour();
			
		}



	public class Interface_Example implements Fruits {

			public void sweet() {
				System.out.println("The fruits are sweet!!!"); //implementation
			}
			
			
			
			public static void main(String[] args) {
				
				
				Interface_Example obj1 = new Interface_Example();
				obj1.sweet();

			}

}