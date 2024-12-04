package edu.wit.cs.comp1000;
import java.util.Scanner;

// TODO: document this class
public class PA2b {

	// TODO: document this function
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a b c: ");
		
		double a= input.nextDouble();
		double b= input.nextDouble();
	    double c= input.nextDouble();
		
		double d= (b*b)-(4*a*c);
		
		double sqrtOfD= Math.sqrt(d);
		double d1= -b/(2*a);
		double d2 = ((-b)+(sqrtOfD))/(2*a);
		double d3 = ((-b)-(sqrtOfD))/(2*a);
		
		if(d<0) {
			System.out.println("Roots: imaginary");
			return;
		}else if(d==0) {
			System.out.printf("Root: %.2f%n", d1);
			return;
		}else {
			if(d2>d3) {
				System.out.printf("Roots: %.2f, %.2f%n", d3, d2);
			}else {
				System.out.printf("Roots: %.2f, %.2f%n", d2, d3);
				
			}
		}
		
		
	}

}