package studentDatabase;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String gradeYear;
    private String studentID;
    private String courses = null;
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 2010;

    //Prompt user to enter student Name and year

    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student firstname: ");
        this.firstName= in.nextLine();

        System.out.print("Enter student lastname: ");
        this.lastName = in.nextLine();

        System.out.print("1 - Freshers\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student gradeYear: ");
        this.gradeYear = in.nextLine();

        setStudentID();

    }

    //Generating ID
    private void setStudentID(){
        id++;
       this.studentID = gradeYear + ""+ id;
    }

    //Enrol in course
    public void enrol() {
        do {
            System.out.print("Enter course(s) to enrol (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                //System.out.println("BREAK!");
                break;
            }
        } while (1 != 0);
//        System.out.println("ENROLLED IN: " + courses);
//        System.out.println("TUITION BALANCE: " + tuitionBalance);
    }
    //View Balance
    public void viewBalance(){
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    //pay Tuition
    public void payTuition(){
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner in= new Scanner(System.in);
        int payment= in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    //Show Status
    public  String toString(){
        return "Name: "+ firstName + " " + lastName +
                "\nGrade Level: "+ gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled: "+ courses +
                "\nBalance: $" + tuitionBalance;
    }

}
