package ClassWork;

import java.util.Scanner;
public class GuessGame {

    public static void main(String[] args) {

         Scanner input = new Scanner(System.in);
         System.out.print("Input Number: ");
                 int num = input.nextInt();

         if(num == 50){
          System.out.print("You Won!");
         }
         if(num < 50){
             System.out.print("Below exact number");
         }
         if(num > 50){
             System.out.print("Above exact number");
         }

    }
}
