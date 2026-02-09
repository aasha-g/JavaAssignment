package oopsAssignment;

class Student {
    String name;
    String student_id;
    double marks_cc;
    double marks_ml;
    double avg_marks;

    // Parameterized Constructor
    public Student(String name, String student_id, double marks_cc, double marks_ml) {
        this.name = name;
        this.student_id = student_id;
        this.marks_cc = marks_cc;
        this.marks_ml = marks_ml;
        this.avg_marks = (marks_cc + marks_ml) / 2;
    }

    public void displayAvg() {
        System.out.println("The average marks scored by " + name + " is " + avg_marks + ".");
    }
}

