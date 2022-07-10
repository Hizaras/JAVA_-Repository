package PetrolStation;

public class FuelStation {
    private String location;

    private String petrol;

    private int litres;

    private double fuelPrice;

    private double discount = 0.5;

    public void purchase(int litres) {
        this.fuelPrice = (litres * fuelPrice) - (litres * fuelPrice * discount);{

        }
    }

    public double getBalance() {
        return fuelPrice;
    }
}
