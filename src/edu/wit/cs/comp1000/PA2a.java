package edu.wit.cs.comp1000;
import java.util.Scanner;
// TODO: document this class
public class PA2a {

	// TODO: document this function
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        
        // Creation of variables
        int sumPlus = 0;        // Sum of positive numbers
        int sumNegative = 0;    // Sum of non-positive numbers
        int sumOfAll = 0;       // Sum of all numbers
        int countPlus = 0;      // Count of positive numbers
        int countNegative = 0;  // Count of non-positive numbers
        int countTotal = 5;

        System.out.print("Enter five whole numbers: ");
        
        for (int i = 0; i < 5; i++) {
            int num = input.nextInt();  // Read each number and run 5 times for all 5 numbers

            // Update sums and counts
            sumOfAll += num;
            if (num > 0) {
                sumPlus += num;
                countPlus++;
            } else {
                sumNegative += num;
                countNegative++;
            }
        }

        // Calculating averages 
        double avgPositive;
        if (countPlus > 0) {
            avgPositive = (double) sumPlus / countPlus;
        } else {
            avgPositive = 0.0;
        }

        double avgNonPositive;
        if (countNegative > 0) {
            avgNonPositive = (double) sumNegative / countNegative;
        } else {
            avgNonPositive = 0.0;
        }

        double avgAll = (double) sumOfAll / 5; 

        // Output the results
        System.out.printf("The sum of the %d positive numbers: %d%n", countPlus, sumPlus);
        System.out.printf("The sum of the %d non-positive numbers: %d%n", countNegative, sumNegative);
        System.out.printf("The sum of the %d numbers: %d%n", countTotal, sumOfAll);
        System.out.printf("The average of the %d positive numbers: %.2f%n", countPlus, avgPositive);
        System.out.printf("The average of the %d non-positive numbers: %.2f%n", countNegative, avgNonPositive);
        System.out.printf("The average of the %d numbers: %.2f%n", countTotal, avgAll);

        input.close();
	}

}
