package collectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		//declaration
		//Hashmap hm=new hashmap();
		//map hm=new hashmap();
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		//adding pairs
		hm.put(101,"john");
		hm.put(102,"Scott");
		hm.put(103,"Mary");
		hm.put(104,"Scott");
		hm.put(102,"David");

		System.out.println(hm);//{101=john, 102=David, 103=Mary, 104=Scott}
		
		System.out.println("Size of the HasMap "+ hm.size());//4
		
		//remove pair
		hm.remove(103);
		System.out.println("After removing : "+hm);//{101=john, 102=David, 104=Scott}
		
		//Access value of the key
		System.out.println(hm.get(102));//David
		
		//get all the keys from the hashmap
		System.out.println(hm.keySet());//[101, 102, 104]
		System.out.println(hm.values());//[john, David, Scott]
		System.out.println(hm.entrySet());//[101=john, 102=David, 104=Scott]
		
		//Reading data
		
		for(int k:hm.keySet())
		{
			System.out.println(k+"    "+hm.get(k));
		}
		
		
		/*
		//using iteration 
		Iterator<Entry<Integer,String>> it= hm.entrySet().iterator();
		
		 while(it.hasNext())
		  {
			  System.out.println(it.next());
		  }
		*/
		
		hm.clear();
		System.out.println(hm.isEmpty());//true
	}

}

