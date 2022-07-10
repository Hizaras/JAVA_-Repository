package chapter3;

import java.util.Scanner;

public class HeartRatesTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HeartRates lekanHealthCare = new HeartRates("Hope", "John",
                9, 8, 1999);

        System.out.println("Enter First Name");
        String name = input.nextLine();
        lekanHealthCare.setFirstName(name);

        System.out.println("Enter Last Name");
        String lName = input.nextLine();
        lekanHealthCare.setLastName(lName);

        System.out.println("Enter Day of Birth");
        int day = input.nextInt ();
        lekanHealthCare.setDay(day);

        System.out.println("Enter Month of Birth");
        int month = input.nextInt();
        lekanHealthCare.setMonth(month);

        System.out.println("Enter Year of Birth");
        int year = input.nextInt();
        lekanHealthCare.setYear(year);

        System.out.println("Welcome" + " " + lekanHealthCare.getFirstName() + " " + lekanHealthCare.getLastName());
        System.out.println("Your Current Age is " + lekanHealthCare.dateOfBirth());
        System.out.println("Your Maximum Heart Rate is " + lekanHealthCare.maximumHeartRate());
        System.out.println("Your Target Heart Rate is: " + lekanHealthCare.targetHeartRate());

    }
}
