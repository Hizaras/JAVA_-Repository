package chapter3;

public class Car {
    private String model;
    private String year;
    private Double price;

    public Car(String model, String year, Double price){

        this.model = model;
        this.year = year;
        this.price = price;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }
    public void setYear(String year){
        this.year = year;
    }
    public String getYear(){
        return year;
    }
    public void setPrice(){
        if (price > 0) {
        this.price = price;}
        else {
            System.out.println("Please Enter A Valid Price");
        }
    }
    public Double getPrice() {
        return price;
    }


}
