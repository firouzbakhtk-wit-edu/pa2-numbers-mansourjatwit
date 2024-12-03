package edu.wit.cs.comp1000;
import java.util.Scanner;

// TODO: document this class
public class PA2b {

	// TODO: document this function
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your birth month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter your birth day (1-31): ");
        int day = scanner.nextInt();
        
        // Validate input
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            System.out.println("Invalid date.");
            scanner.close();
            return;
        }
        
        String sign = "";
        String horoscope = "";
        
        // Determine astrological sign and horoscope
        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            sign = "Aries";
            horoscope = "Fire is coming upon you!";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            sign = "Taurus";
            horoscope = "The symbol of the bull is wild!";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 21)) {
            sign = "Gemini";
            horoscope = "The light will come to you!";
        } else if ((month == 6 && day >= 22) || (month == 7 && day <= 22)) {
            sign = "Cancer";
            horoscope = "Your kindness will be an inspiration to other people!";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            sign = "Leo";
            horoscope = "You will get the best grades you have ever gotten!";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            sign = "Virgo";
            horoscope = "Keep your head up!";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            sign = "Libra";
            horoscope = "Your relationships will thrive!";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            sign = "Scorpio";
            horoscope = "Keep working as hard as possible!";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            sign = "Sagittarius";
            horoscope = "Do not let procrastination beat you!";
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            sign = "Capricorn";
            horoscope = "You will have a good day today!";
        } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            sign = "Aquarius";
            horoscope = "Innovation will be your strongest asset.";
        } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            sign = "Pisces";
            horoscope = "Dreams may hold valuable insights.";
        }
        
        // Output result
        System.out.printf("You are a %s!%n%s%n", sign, horoscope);
        scanner.close();
    }

}
