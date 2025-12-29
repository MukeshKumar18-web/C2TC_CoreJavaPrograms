package non_static_access;

abstract class Shape_Example{
	
	abstract void draw(); //functionality or declaration

}

class Circle extends Shape_Example{
	
	void draw() {
		System.out.println("Drawing a Circle");
	}
	
}

public class Abstraction {

	public static void main(String[] args) {
		
		Circle s = new Circle();
		s.draw();
		
		
		

	}

}