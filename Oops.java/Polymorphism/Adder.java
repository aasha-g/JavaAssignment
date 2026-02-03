package oopsPolymorphism;

public class Adder {           //method overloading

	
		int a =10,b=20;
		
		void sum()                    //method name should be same
		{
			System.out.println(a+b);
		}
		
		
	/*	int sum()                    //Duplicate:don't consider the return type
		{
			return(a+b);
		}*/
		
		
		
		
		
		void sum(int x,int y)         //No. of parameters should be different
	    {
		    System.out.println(x+y);
	    }
		
		void sum(int x,double y)     //data type of parameters should be different
		{
			System.out.println(x+y);
		}
        
		void sum(double x,int y)    //order should be different
		{
			System.out.println(x+y);
		}
}
