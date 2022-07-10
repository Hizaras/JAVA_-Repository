package chapter4;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Student Grade");

        int grade = input.nextInt();
        if(grade >= 90){
            System.out.println("A");
        }
        else if (grade >= 80){
            System.out.println("B");
        }
        else if (grade >= 70){
            System.out.println("c");
        }
        else if (grade >= 60){
            System.out.println("D");
        }
        else if (grade >= 50){
            System.out.println("E");
        }
        else if (grade <= 40){
            System.out.println("F");
            System.out.println("Student should write the course again.");
        }
    }

}
