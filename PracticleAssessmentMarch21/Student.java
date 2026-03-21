package assessmentCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class Student {
	
	
		int studentId;
		String name ;
		int Java_marks;
		int Selenium_marks;
		static int total_marks;
		int Result;
		
		Student(int studentId,String name,int Java_marks,int Selenium_marks,int total_marks,int Result ){
			this.studentId=studentId;
			this.name=name;
			this.Java_marks=Java_marks;
			this.Selenium_marks=Selenium_marks;
			this.total_marks=Java_marks+Selenium_marks;
			this.Result=(total_marks/2);
		}
		
	
	void display(){
		
		System.out.println(studentId+"|"+name+"|"+ Java_marks+"|"+Selenium_marks+"|"+ total_marks+"|"+  Result);
	}
	

	public static void main(String[] args) {
		
		HashMap<Integer,Student> hm=new HashMap<Integer,Student>();
		
		hm.put(101,new Student(101,"A",30,20,50,25));
		hm.put(102,new Student(102,"B",40,80,120,60));
		hm.put(103,new Student(103,"C",60,20,80,40));
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your choice:");
		int S=sc.nextInt();
		
		//hm.display();
		/*Iterator<Entry<Integer,Student>>it=hm.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.hasNext());
		}
	*/
		
		
		
		
		
		
		
		
		
		
		
		
		

	}


	private static char[] get(Integer x) {
		// TODO Auto-generated method stub
		return null;
	}


	
	}



