package chapter3;

public class Petrol {
    private String location;

    private final double percentage = 0.01;

    private final double fuelPrice = 200;

    private int amount;

    public Petrol(String location, double percentage, double fuelPrice, int amount){

        this.location = location;
        this.percentage = percentage;
        this.fuelPrice = fuelPrice;
        this.amount = amount;
    }
public void setLocation(String location){
        this.location = location;
}
public String getLocation();{
        return location;
    }


}
