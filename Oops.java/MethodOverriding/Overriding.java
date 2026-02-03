package methodOverriding;

class Employee
{
	double salary()
	{
		return 3000;
	}
}

class Manager extends Employee
{
	double salary()
	{
		return 5000;
	}
}


public class Overriding {

	public static void main(String[] args) {
		
    Manager m1 = new Manager();
    Employee m2 = new Manager();
    Employee m3 = new Employee();
    System.out.println(m1.salary());
    System.out.println(m2.salary());
    System.out.println(m3.salary());
    }

}

