package studentDatabase;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {

        //Ask how many new students needed to be add
        System.out.print("Enter numbers of new student to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        //Create n number of new students
        for (int n = 0; n < numOfStudents; n++) {
            students[n] = new Student();
            students[n].enrol();
            students[n].payTuition();
        }
        for (int n = 0; n < numOfStudents; n++) {
            System.out.println(students[n].toString());
        }
    }
}
