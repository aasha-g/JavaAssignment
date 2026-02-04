package abstraction;

  interface shape
{
	int length=10; //final and static
	int width= 20;
	
	void circle();     //abstract method
	
	default void square()
	{
		System.out.println("This is square");
	}
	

	static void rectangle()
	{
		System.out.println("This is rectangle");
	}
	
}

public class InterfaceDemo  implements shape{
	
	public void circle()   // implement the unimplemented method
	{
		System.out.println("This is circle");
	}

	public static void main(String[] args) {
		
        shape sh=new InterfaceDemo();//Can't create object for the interface--create an object for a class
        sh.circle();                 //and store in a variable of a interface
        sh.square();
        shape.rectangle();
	}

}

