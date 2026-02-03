package methodOverriding;
class Test1
{
	final void m()
	{
		System.out.println("m method from Test1");
	}
	
class Test2 extends Test1
{
	//void m()               //can't do overriding for a method m
	{
		System.out.println("m method from Test2");
	}
}
public class FinalKeyword2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}}
