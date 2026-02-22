package collectionFramework;

import java.util.ArrayList;

public class Mobile {
 String brand;
 String model;
 int price;
 int ram;

 public Mobile(String brand, String model, int price, int ram) {
     this.brand = brand;
     this.model = model;
     this.price = price;
     this.ram = ram;
 }   
         
      void display() 
     {     		 
    	 System.out.println(brand+" "+model+" "+price+" "+ram);
     } 
	
     
     public static void find_mobile_by_brand(String brand_name, ArrayList<Mobile> list) {
         for (Mobile m : list) 
         {
             if (m.brand.equalsIgnoreCase(brand_name)) 
             {
                 m.display();
             }
         }
    }   	
     
     public static void display_mobile_details(int price_ll, int price_ul, ArrayList<Mobile> list ) {
   	  for(Mobile m:list)
   	  {
   		  if(m.price>=price_ll&&m.price<=price_ul)
   		  {
   			  m.display();
   		  }
   	  }
     }
     
   	public static void display_mobile_details1(int ram, int price, ArrayList<Mobile> list){
   		for (Mobile m : list) 
   	    {
   	        if (m.ram>ram&&m.price<price) 
   	        {
   	            m.display();
   	        }
   	    }
   	     }
}
		
