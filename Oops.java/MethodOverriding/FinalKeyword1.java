package methodOverriding;

class A
{
	final int a =100;
}

public class FinalKeyword1 {

	public static void main(String[] args) {
		
		A a1 = new A();
		//a1.a=200;  --incorrect can not change the variable
		System.out.println(a1.a);
		
	}

}

