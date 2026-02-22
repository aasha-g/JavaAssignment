package collectionFramework;

import java.util.ArrayList;  
import java.util.Iterator;  

public class ArrayListDemo {

	public static void main(String[] args) {
		//list,set,map
		//ArrayList,hashset,Hashmap
		
		//Declaration
		  ArrayList mylist=new ArrayList();
		//List mylist=new ArrayList();
		// ArrayList<integer> mylist=new ArrayList<integer>();
		  
	    //adding data into arraylist
		  mylist.add(100);
		  mylist.add(10.5);
		  mylist.add('A');
		  mylist.add("welcome");
		  mylist.add(true);
		  mylist.add(100);
		  mylist.add(null);
		  mylist.add(null);
		  
		  System.out.println(mylist);//[100, 10.5, A, welcome, true, 100, null, null]
		  
	   //size of the arraylist
		  System.out.println("size of the arraylist :" + mylist.size());//8
		  
	   //Printing Arraylist
		  System.out.println("Printing the arraylist :" + mylist);//[100, 10.5, A, welcome, true, 100, null, null]
	 
	   // remove element from the arraylist  
		  mylist.remove(3);
		  System.out.println("After removing " + mylist);//[100, 10.5, A, true, 100, null, null]
		  
	   //Insert element in the arraylist 
		  mylist.add(2,"java");
		  System.out.println("After insertion " + mylist);//-->[100, 10.5, java, A, true, 100, null, null]
		  
	   //Modify element in the array-->[100, 10.5, python, A, true, 100, null, null]
		  mylist.set(2,"python");
		  System.out.println("After replace " + mylist);
		  
	   //Access specific element from the arraylist -->100
		  System.out.println(mylist.get(5));
		  
	   //Reading all the elements from the arraylist
		  
		  
	   //using normal for loop
		  for(int i=0;i<mylist.size();i++)
		  {
			  System.out.println(mylist.get(i)); 
		  }
		  
		  
		//using for..each loop
		/*  for(Object x:mylist)
		  {
			  System.out.println(x);
		  }
		 */ 
			  
		//using iterator
		/*  Iterator it = mylist.iterator();
		  
		  while(it.hasNext())
		  {
			  System.out.println(it.next());
		  }
		  */
		  
		//Checking Arraylist empty or not
		  System.out.println("is Arraylist empty "+mylist.isEmpty());//false
		   
		//remove all the elements
		  ArrayList mylist2=new ArrayList();
		  mylist2.add('A');
		  mylist2.add(100);
		  
		  mylist.removeAll(mylist2);
		  System.out.println("After removing multiple elements "+mylist); 
		  //[10.5, python, true, null, null]
	}

}

