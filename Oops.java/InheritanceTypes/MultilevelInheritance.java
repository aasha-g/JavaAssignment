package inheritanceTypes;

class X
{
	int x=10;
	void display()
	{
	  System.out.println(x);
	}
	
}

class Y extends X
{
	int y=20;
	void show()
	{
		System.out.println(y);
	}
}

class Z extends Y
{
	int z=30;
	void print()
	{
		System.out.println(z);
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		
		Z zobj = new Z();
	      	      
		zobj.display();
		zobj.show();
		zobj.print();
	}

}

