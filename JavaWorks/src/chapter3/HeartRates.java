package chapter3;

public class HeartRates {
    private String firstName;
    private String lastName;
    private int day;
    private int month;
    private int year;

    public HeartRates(String firstName, String lastName, int day, int month,int year) {


        this.firstName = firstName;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;

    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setDay(int day){
        this.day = day;
    }
    public int getDay(){
        return day;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public int getMonth(){
       return month;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }
    public int dateOfBirth(){
        return 2022 - year;
    }
    public double maximumHeartRate(){
        return 220 - year;
    }
    public double targetHeartRate(){
        return 0.05 * maximumHeartRate();
    }


}
