package oopsAssignment;
public class Stu_AdmissionMain {
    public static void main(String[] args) {
        
        student_marks girish = new student_marks("Girish", 101, 'N', 0, 0, 0, 0);
        student_marks satish = new student_marks("Satish", 102, 'Y', 2, 56, 81, 59);
        student_marks priya = new student_marks("Priya", 103, 'Y', 2, 51, 45, 50);
        student_marks medha = new student_marks("Medha", 104, 'Y', 3, 91, 55, 60);
        student_marks supriya = new student_marks("Supriya", 105, 'Y', 4, 95, 89, 91);

       
        System.out.println("============================================================================");
        System.out.println("| ID | Name | Fee_Status | Physics | Maths | Java | Average | Grade |");
        System.out.println("============================================================================");

        
        girish.displayRow();
        satish.displayRow();
        priya.displayRow();
        medha.displayRow();
        supriya.displayRow();

        System.out.println("============================================================================");
    }
}

