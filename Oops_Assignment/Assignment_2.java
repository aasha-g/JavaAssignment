package oopsAssignment;

class student_admission {
 String name;
 int id;
 char fee_status; 
 double fee_amount = 70000;

 public student_admission(String name, int id, char fee_status) {
     this.name = name;
     this.id = id;
     this.fee_status = fee_status;
 }
}

class student_marks extends student_admission {
 int sem, maths, physics, java;
 double avg;
 String grade;

 public student_marks(String name, int id, char fee_status, int sem, int m, int p, int j) {
     super(name, id, fee_status); 
     this.sem = sem;
     this.maths = m;
     this.physics = p;
     this.java = j;

         if (fee_status == 'Y') {
         this.avg = (m + p + j) / 3.0;
         
         if (avg >= 90) {
             grade = "GA";
         } else if (avg >= 80) {
             grade = "GB";
         } else {
             grade = "GC";
         }
     }
 }

 public void displayRow() {
     if (fee_status == 'Y') {
         System.out.println("| " + id + " | " + name + " | " + fee_status + " | " + physics + " | " + maths + " | " + java + " | " + avg + " | " + grade + " |");
     } else {
         
         System.out.println("| " + id + " | " + name + " | " + fee_status + " | NA | NA | NA | NA | NA |");
     }
 }
}
    
