package Assignment;

public class PyramidLooping {
    public static void main(String[] args) {

        for(int i = 0; i < 5; i++){
            for (int k = 5-i; k >1; k--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
