package collectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
	//Declaration
		HashSet myset=new HashSet();
	  //Set myset=new HashSet();
	  //HashSet<String> myset=new HashSet<String>();
		
	//adding elements
		myset.add(100);
		myset.add(10.5);
		myset.add('A');
		myset.add("welcome");
		myset.add(true);
		myset.add(100);
		myset.add(null);
		myset.add(null);
		
		 System.out.println(myset);//[null, A, 100, 10.5, welcome, true]
		 
	//removing element
		 myset.remove(10.5);
		 System.out.println("After removing :"+myset);//[null, A, 100, welcome, true]
		 
	//inserting is not possible
	//Accessing specific element is not possible
		 
		 //convert hashset to Arraylist
		 ArrayList al=new ArrayList(myset);
		 System.out.println(al);//[null, A, 100, welcome, true]
		 System.out.println(al.get(2));//100
		 
    //reading all the elements from hashset
		 
		 for(Object x:myset)
		 {
			 System.out.println(x);
		 }
	
		 /*
	//using iterator
		 Iterator it = myset.iterator();
		  
		  while(it.hasNext())
		  {
			  System.out.println(it.next());
		  }
		  */
	}

}

