package chapter2;
import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Integer1: ");
        int num1 = input.nextInt();

        System.out.print("Enter Integer2: ");
        int num2 = input.nextInt();

        if(num1==num2){
            System.out.print("Both numbers are Equal");
        }
        if(num1 > num2){
            System.out.println("Integer1 is larger");
        }
        if(num2 > num1){
            System.out.println("Integer2 is larger");

        }

    }

}
