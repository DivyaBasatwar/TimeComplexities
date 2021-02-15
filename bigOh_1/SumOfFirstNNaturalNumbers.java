package bigOh_1;

import java.util.Scanner;

public class SumOfFirstNNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number ===> ");
		int n = sc.nextInt();
		sc.close();
		if(n<0) {
			System.out.println("Natural Numbers Starts From 1");
			return;
		}
		
		double sum = (n*(n+1))/2.0;
		System.out.println("Sum of first "+n+" natural numbers is "+sum);
	}

}
