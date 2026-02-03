package methodOverriding;

final class Test1
{
	void m()
	{
		System.out.println("m method from Test1");
	}
	
class Test2 extends Test1 // can not extend to class Test1
{
	void m()               
	{
		System.out.println("m method from Test2");
	}
}

public class FinalKeyword3 {

	public static void main(String[] args) {
		
	}

}
