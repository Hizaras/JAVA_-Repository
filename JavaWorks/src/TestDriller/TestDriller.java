package TestDriller;

public class TestDriller {
    private int amount;


    public void setNoOfCopies(int numberOfCopies) {
        if (numberOfCopies != 0 && numberOfCopies <= 4){
            amount = 2000 * numberOfCopies;
        }
        if (numberOfCopies >= 5 && numberOfCopies < 10){
            amount = 1800 * numberOfCopies;
        }
        if (numberOfCopies >= 10 && numberOfCopies < 30){
            amount = 1600 * numberOfCopies;
        }
        if (numberOfCopies >= 30 && numberOfCopies < 50){
            amount = 1500 * numberOfCopies;
        }
        if (numberOfCopies >= 50 && numberOfCopies < 100){
            amount = 1300 * numberOfCopies;
        }
        if (numberOfCopies >= 100 && numberOfCopies < 200){
            amount = 1200 * numberOfCopies;
        }
        if(numberOfCopies >= 200 && numberOfCopies < 500){
            amount = 1100 * numberOfCopies;
        }
        if(numberOfCopies >= 500){
           amount = 1000 * numberOfCopies;
        }
    }

    public int getAmount() {
        System.out.println("Total price to be paid for the number of copies is: "+ amount);
        return amount;
    }
}
