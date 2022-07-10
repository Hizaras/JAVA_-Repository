package chapter3;

import java.util.Calendar;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private int date;
    private int month;
    private int year;
    private double height;
    private double weight;

   public HealthProfile(String firstName, String lastName, String gender,
                        int date, int month, int year, double height, double weight){

       this.firstName = firstName;
       this.lastName = lastName;
       this.gender = gender;
       this.date = date;
       this.height = height;
       this.weight = weight;
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
   public String getLastName (){
       return lastName;
   }
   public void setGender(String gender){
       this.gender =gender;
   }
   public String getGender(){
       return gender;
   }
   public void setDate(int date){
       this.date = date;
   }
   public void setMonth(int month){
       this.month = month;
   }

    public int getMonth() {
        return month;
    }

    public void setHeight(double height){
       this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public void setWeight(double weight){
       this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setYear(int year){
       this.year = year;
    }

    public int getYear() {
        return year;
    }
    public int dateOfBirth(){
        return 2022 - year;
    }
    public int maximumHeartRate(){
       return 220 - dateOfBirth();
    }
    public double targetHeartRate(){
       return 0.05 * maximumHeartRate();
    }
    public double bmi(){
       return ( weight * 703) / (height * height);
    }
}
