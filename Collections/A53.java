package collectionFramework;

import java.util.ArrayList;

public class A53 {
 public static void main(String[] args) {
     
     ArrayList<A54> mobileList = new ArrayList<>();

     
     mobileList.add(new A54("Samsung", "Galaxy S23", 75000, 8));
     mobileList.add(new A54("Samsung", "Galaxy M14", 14500, 6));
     mobileList.add(new A54("Apple", "iPhone 15", 80000, 6));
     mobileList.add(new A54("Xiaomi", "Redmi Note 12", 18000, 8));
     mobileList.add(new A54("Samsung", "Galaxy A34", 28000, 8));
     mobileList.add(new A54("Realme", "C53", 9500, 8)); 
     mobileList.add(new A54("Vivo", "T2x", 13000, 4));
     mobileList.add(new A54("OnePlus", "Nord CE 3", 19500, 12));
     mobileList.add(new A54("Motorola", "G54", 16000, 8));
     mobileList.add(new A54("Samsung", "F14", 12000, 4));

     
     A54.find_mobile_by_brand("Samsung", mobileList);
     A54.display_mobile_details(15000, 20000, mobileList );
     A54.display_mobile_details1(6,10000, mobileList);

 }
 
        /*Output:
         * Samsung Galaxy S23 75000 8
           Samsung Galaxy M14 14500 6
           Samsung Galaxy A34 28000 8
           Samsung F14 12000 4
           Xiaomi Redmi Note 12 18000 8
           OnePlus Nord CE 3 19500 12
           Motorola G54 16000 8
           Realme C53 9500 8

         */
	
}



   
    
     
