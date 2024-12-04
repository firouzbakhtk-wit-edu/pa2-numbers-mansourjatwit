package edu.wit.cs.comp1000;
import java.util.Scanner;

// TODO: document this class
public class PA2a {

	// TODO: document this function
	public static void main(String[] args) {
		
		// TODO: write your code here
		Scanner input = new Scanner(System.in);
        
        System.out.print("Enter five whole numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();
        
        
        int sumPositive = 0;
        int sumNonPositive = 0;
        int sumAll = 0;
        int countPositive = 0;
        int countNonPositive = 0;

        
        sumAll += num1;
        if (num1 > 0) {
            sumPositive += num1;
            countPositive++;
        } else {
            sumNonPositive += num1;
            countNonPositive++;
        }

        sumAll += num2;
        if (num2 > 0) {
            sumPositive += num2;
            countPositive++;
        } else {
            sumNonPositive += num2;
            countNonPositive++;
        }
        sumAll += num3;
        if (num3 > 0) {
            sumPositive += num3;
            countPositive++;
        } else {
            sumNonPositive += num3;
            countNonPositive++;
        }
        sumAll +=num4;
        if (num4 > 0) {
            sumPositive += num4;
            countPositive++;
        } else {
            sumNonPositive += num4;
            countNonPositive++;
        }
        sumAll += num5;
        if (num5 > 0) {
            sumPositive += num5;
            countPositive++;
        } else {
            sumNonPositive += num5;
            countNonPositive++;
        }

        
        double averagePositive = countPositive > 0 ? (double) sumPositive / countPositive : 0.0;
        double averageNonPositive = countNonPositive > 0 ? (double) sumNonPositive / countNonPositive : 0.0;
        double averageAll = (double) sumAll / 5;

        String positiveCountLabel = (countPositive == 1) ? "number" : "numbers";
        String nonPositiveCountLabel = (countNonPositive == 1) ? "number" : "numbers";

        System.out.printf("The sum of the %d positive %s: %d%n", countPositive, positiveCountLabel, sumPositive);
        System.out.printf("The sum of the %d non-positive %s: %d%n", countNonPositive, nonPositiveCountLabel, sumNonPositive);
        System.out.printf("The sum of the 5 numbers: %d%n", sumAll);
        System.out.printf("The average of the %d positive %s: %.2f%n", countPositive, positiveCountLabel, averagePositive);
        System.out.printf("The average of the %d non-positive %s: %.2f%n", countNonPositive, nonPositiveCountLabel, averageNonPositive);
        System.out.printf("The average of the 5 numbers: %.2f%n",averageAll);
		}
}

