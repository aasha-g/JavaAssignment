package polymorphism_2;

public class Poly_bank {

	public static void main(String[] args) {

		Bank b; // object of parent class
		
		b = new Bob();
		//bob b1 = new bob();
		System.out.println(" Bob : ROI " + b.getRateOfInterest());
		
		  b = new Citi(); 
		  System.out.println(" CITI : ROI " + b.getRateOfInterest());
		  
		   b  = new Canara(); 
		  System.out.println(" Canara : ROI " + b.getRateOfInterest());

		 
	}

}
