/*
 * 2) Create an arraylist to store the details of 10 mobile phones. Below details of the mobile 
phone should be stored. This is common for the next 4 problems. 
Note: hardcode the details of the 10 mobile phones. 

Mobile : Brand, Model, Price, Ram


2) Develop a function to list all the details of the mobile phones belonging to the "Samsung" brand.

find_mobile_by_brand(String brand_name)


3) Develop a function to list all the details of the mobile phones whose priced is between 
Rs. 15,000/- & Rs. 20,000/- 
display_mobile_details(int price_ll, int price_ul, ArrayList )


4) Develop a function to  list all the details of the mobile phones whose 
RAM > 6 GB and price is less than 10,000/-

display_mobile_details(int ram, int price, ArrayList)


 */
package collectionFramework;

import java.util.ArrayList;

public class A54 {
 String brand;
 String model;
 int price;
 int ram;

 public A54(String brand, String model, int price, int ram) {
     this.brand = brand;
     this.model = model;
     this.price = price;
     this.ram = ram;
 }   
         
      void display() 
     {     		 
    	 System.out.println(brand+" "+model+" "+price+" "+ram);
     } 
	
     
     public static void find_mobile_by_brand(String brand_name, ArrayList<A54> list) {
         for (A54 m : list) 
         {
             if (m.brand.equalsIgnoreCase(brand_name)) 
             {
                 m.display();
             }
         }
    }   	
     
     public static void display_mobile_details(int price_ll, int price_ul, ArrayList<A54> list ) {
   	  for(A54 m:list)
   	  {
   		  if(m.price>=price_ll&&m.price<=price_ul)
   		  {
   			  m.display();
   		  }
   	  }
     }
     
   	public static void display_mobile_details1(int ram, int price, ArrayList<A54> list){
   		for (A54 m : list) 
   	    {
   	        if (m.ram>ram&&m.price<price) 
   	        {
   	            m.display();
   	        }
   	    }
   	     }
}
		
