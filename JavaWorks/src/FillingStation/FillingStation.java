package FillingStation;

public class FillingStation {

    private String location;
    private final int fuelprice = 200;
    private final double discount = 0.02;
    private double litre;
    private double amount;


    public FillingStation(String location){

        this.location =  location;
    }

    public void buyFuel(int litre) {
        this.amount = (litre * fuelprice) - (litre * fuelprice * discount);
    }
    public double getAmount(){
        return amount;


    }
}
