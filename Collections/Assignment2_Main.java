package collectionFramework;

import java.util.ArrayList;

public class Main {
 public static void main(String[] args) {
     
     ArrayList<Mobile> mobileList = new ArrayList<>();

     
     mobileList.add(new Mobile("Samsung", "Galaxy S23", 75000, 8));
     mobileList.add(new Mobile("Samsung", "Galaxy M14", 14500, 6));
     mobileList.add(new Mobile("Apple", "iPhone 15", 80000, 6));
     mobileList.add(new Mobile("Xiaomi", "Redmi Note 12", 18000, 8));
     mobileList.add(new Mobile("Samsung", "Galaxy A34", 28000, 8));
     mobileList.add(new Mobile("Realme", "C53", 9500, 8)); 
     mobileList.add(new Mobile("Vivo", "T2x", 13000, 4));
     mobileList.add(new Mobile("OnePlus", "Nord CE 3", 19500, 12));
     mobileList.add(new Mobile("Motorola", "G54", 16000, 8));
     mobileList.add(new Mobile("Samsung", "F14", 12000, 4));

     
     Mobile.find_mobile_by_brand("Samsung", mobileList);
     Mobile.display_mobile_details(15000, 20000, mobileList );
     Mobile.display_mobile_details1(6,10000, mobileList);

 }
 
 
	
}



   
    
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
 
 

  
 


