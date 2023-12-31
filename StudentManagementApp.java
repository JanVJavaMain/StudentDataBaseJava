//package studentdatabase;
import java.util.Scanner; 

public class StudentManagementApp {
    public static void main(String[] args) {
        System.out.println("Enter number of new students to enroll: ");
        
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();

        Student students[] = new Student[numOfStudents];

        for (int n = 0; n < numOfStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payLoan();
            System.out.println(students[n].toString());
        }
    }
}