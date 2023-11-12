import java.util.Scanner;

public class Student {
    private String firstName, lastName;
    private String courses = null;
    private String studentID;
    private int studentLoans = 0; 
    private int gradeYear;
    private static int fee = 600; 
    private static int id = 1000;

    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student's first name: ");
        this.firstName = in.nextLine();
        System.out.println("Enter student's last name: ");
        this.lastName = in.nextLine();

        System.out.print("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student grade / year: ");
        this.gradeYear = in.nextInt();
        
        setStudentID();
    }  

    private void setStudentID() {
        id++;
        studentID = gradeYear + "" + id;
    }

    public void enroll() {
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course; 
                studentLoans = studentLoans + fee;
            } 
            else { break; }
        } while (1 != 0);

        System.out.println("Enrolled in: " + courses);
        System.out.println("Tuition fee: $" + fee);
    }

    public void viewBalance() {
        System.out.println("Your loan is: $" + studentLoans);
    }

    public void payLoan() {
        viewBalance();
        System.out.println("Amount of money you want to pay: ");
        Scanner in = new Scanner(System.in); 
        int payment = in.nextInt();
        studentLoans = studentLoans - payment; 
        System.out.println("Thank you for your payment of " + payment + "$");
        viewBalance();
    }  
    
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\ngrade/year: " + gradeYear+  "\nStudentID"+ studentID + "\nCourses enrolled: " + courses + "\nBalance: $" + studentLoans;
    }
}