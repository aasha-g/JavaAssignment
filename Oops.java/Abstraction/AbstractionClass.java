package abstraction;
abstract class shape1
{
	static int length=10; //final and static
	static int width= 20;
	
	abstract void circle();     //abstract method
	
	static void rectangle()
	{
		System.out.println("This is rectangle");
		System.out.println(length);
		System.out.println(width);
	}
}

public class AbstractionDemo extends shape1 {
	
	public void circle()   // implement the unimplemented method
	{
		System.out.println("This is circle");
	}

	


	public static void main(String[] args) {
		
		AbstractionDemo d = new AbstractionDemo(); 
	
		d.circle();
		rectangle();
		
		
	}
}

