package Assignment.Airconditioner;

public class Airconditioner {
    private String on;
    private String off;

    private int temperature = 18;



    public void IsOn(String on){
        this.on = on;
    }
    public String getIsOn(){
        return on;
    }

    public void isOff(String off){
        this.off = off;
    }

    public String getOff() {
        return off;
    }
    public int increaseTemperature(){
        if (temperature > 29) {

            return 30;



        }
            temperature++;
            return temperature;
    }
    public int decreaseTemperature(){
        if (temperature < 17){
            return 16;
        }
        temperature--;
        return temperature;
    }


}


