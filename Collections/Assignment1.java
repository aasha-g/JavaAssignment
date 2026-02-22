package collectionFramework;

import java.util.ArrayList;

public class Assignment1 {
	
	static class Student {
        String name;
        int id;

        Student(String name, int id) {
            this.name = name;
            this.id = id;
        }
    }

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<>();

        // Adding 5 students 
        studentList.add(new Student("A", 101));
        studentList.add(new Student("B", 102));
        studentList.add(new Student("C", 103));
        studentList.add(new Student("D", 104));
        studentList.add(new Student("E", 105));
        
        for (Student s : studentList)
        {
            System.out.println("Student Name: " + s.name + "   Student ID: " + s.id);
        }
	}

}

