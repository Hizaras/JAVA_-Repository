package chapter3;

public class CarApplication {
    public static void main(String[] args) {

        Car bmw = new Car("BMW" , "2021" , 4_500_000.90);
        Car porshce = new Car("Porsche" , "2020" , 2_500_000.89);

        System.out.println("The Price of your BMW is " + bmw.getPrice());
        System.out.println("The Price of your Porsche is" + porshce.getPrice());

        double newBmwPrice = (5.0/100) * bmw.getPrice();
        double newPorschePrice = (7.0/100) * porshce.getPrice();

        System.out.printf("The Discounted price on the BMW is %3f%n" , newBmwPrice);
        System.out.printf("The Discounted price on the Porsche is %2f%n" , newPorschePrice);
    }
}
