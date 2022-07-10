package Assignment;

public class Asterisks2 {
    public static void main(String[] args) {


        for (int c = 0; c < 10; c++) {
            for (int b = 10; b > 1; b--) {
                System.out.print(" ");
            }
            for (int b = 0; b <= c; b++) {
                System.out.print(" *");
            }
            System.out.println();


        }
    }
}