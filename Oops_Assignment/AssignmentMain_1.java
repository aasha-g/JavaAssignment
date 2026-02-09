package oopsAssignment;

public class StudentMain {
	
	    public static void main(String[] args) {
	        // Create 3 students
	        Student s1 = new Student("A", "S01", 80, 90);
	        Student s2 = new Student("B", "S02", 100, 80);
	        Student s3 = new Student("C", "S03", 90, 50);

	        // Display averages
	        s1.displayAvg();//avg:85
	        s2.displayAvg();//avg:90
	        s3.displayAvg();//avg:70

	        // Determine highest scorer
	        Student highest = s1;
	        if (s2.avg_marks > highest.avg_marks) {    //90>85-true--hightest=90
	        	highest = s2;
	        }
	        if (s3.avg_marks > highest.avg_marks) {    //70>90--false
	        	highest = s3;
	        }                                           //highest=s2

	        System.out.println("\nWith " + highest.avg_marks + ", " + highest.name + " is the highest scorer.");
	    }
	}


