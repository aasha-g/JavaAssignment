/*
 * Create a arraylist to store the details of 5 students(student name & student id).
 */
package collectionFramework;
import java.util.ArrayList;

public class A52 {
	
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
              /*Output:
               * Student Name: A   Student ID: 101
                 Student Name: B   Student ID: 102
                 Student Name: C   Student ID: 103
                 Student Name: D   Student ID: 104
                 Student Name: E   Student ID: 105

               */
}
