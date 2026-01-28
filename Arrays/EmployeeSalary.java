package arrays;

 class Employee {
	
	    int id;
	    String name;
	    double salary;

	  	    Employee(int id, String name, double salary) {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	    }
	}

	public class EmployeeArray {
	    public static void main(String[] args) {
	        
	        Employee[] M = new Employee[3];
	        
	        M[0] = new Employee(10, "A", 1000.00);
	        M[1] = new Employee(20, "B", 1500.00);
	        M[2] = new Employee(30, "C", 2000.00);

	        
	        Employee highestPaid = M[0];

	        for (int i = 0; i < M.length; i++) {
	        	
	            if (M[i].salary > highestPaid.salary) {
	               
	                highestPaid = M[i];
	            }
	        }

	        System.out.println("Employee with Highest Salary  :");
	        System.out.println("ID: " + highestPaid.id);
	        System.out.println("Name: " + highestPaid.name);
	        System.out.println("Salary: " + highestPaid.salary);
	    }
	}
