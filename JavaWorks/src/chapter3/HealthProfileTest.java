package chapter3;

import java.util.Scanner;

public class HealthProfileTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HealthProfile lekanHealthCare = new HealthProfile("glory","mama",
                "female", 19, 03, 1997, 5.11, 50);

        System.out.println("Enter first name: ");
        String name = input.nextLine();
        lekanHealthCare.setFirstName(name);

        System.out.println("Enter last name: ");
        String lName = input.nextLine();
        lekanHealthCare.setLastName(lName);

        System.out.println("Enter gender: ");
        String gender = input.nextLine();
        lekanHealthCare.setGender(gender);

        System.out.println("Enter day of birth: ");
        int day = input.nextInt();
        lekanHealthCare.setDate(day);

        System.out.println("Enter month: ");
        int month = input.nextInt();
        lekanHealthCare.setMonth(month);

        System.out.println("Enter year: ");
        int year = input.nextInt();
        lekanHealthCare.setYear(year);

        System.out.println("Enter height: ");
        double height = input.nextDouble();
        lekanHealthCare.setHeight(height);

        System.out.println("Enter weight: ");
        double weight = input.nextDouble();
        lekanHealthCare.setWeight(weight);

//        System.out.printf("Welcome  %s%n%s%n, Your Current age is %d%n Years Old. " ,
//                "Your Maximum Heart Rate is %d%n and your Target Heart Rate is %d , " ,
//                "Your Body Mass Index is %d" , lekanHealthCare.getFirstName() , lekanHealthCare.getLastName() ,
//                lekanHealthCare.dateOfBirth() , lekanHealthCare.maximumHeartRate() ,
//                lekanHealthCare.targetHeartRate() , lekanHealthCare.bmi());

        System.out.println("Welcome" + " " + lekanHealthCare.getFirstName() + " " + lekanHealthCare.getLastName());
        System.out.println("Your Current Age is " + lekanHealthCare.dateOfBirth());
        System.out.println("Your Maximum Heart Rate is " + lekanHealthCare.maximumHeartRate());
        System.out.println("Your Target Heart Rate is: " + lekanHealthCare.targetHeartRate());
        System.out.println("Your Body Mass Index " + lekanHealthCare.bmi());
    }
}
