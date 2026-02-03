package inheritanceTypes;

class parent
{
	void display(int a)
	{
	  System.out.println(a);
	}
	
}

class child1 extends parent
{
	void show(int b)
	{    
		System.out.println(b);
	}
}

class child2 extends parent
{
	void print(int c)
	{    
		System.out.println(c);
	}
}

public class HierarchyInheritance {

	public static void main(String[] args) {
		
      child1 obj1 = new child1();
      obj1.display(100);   //parent
      obj1.show(200);      //child1
      
      child2 obj2 = new child2();
      obj2.display(1000);//parent
      obj2.print(2000);  //child2
	}

}

