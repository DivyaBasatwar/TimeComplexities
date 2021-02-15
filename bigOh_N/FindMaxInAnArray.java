package bigOh_N;

import java.util.Scanner;

public class FindMaxInAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array ===> ");
		int n = sc.nextInt();
		
		if(n<=0) {
			System.out.println("Size of array should be greater than zero");
			sc.close();
			return;
		}
		
		int[] arr = new int[n];
		int max = Integer.MIN_VALUE;
		
		System.out.println("Enter the "+n+" elements of an array");
		for(int i=0;i<n;i++) {
			System.out.print("\nEnter the element at position "+(i+1)+" ===> ");
			arr[i] = sc.nextInt();
			if(arr[i]>max) {
				max = arr[i];
			}
			
		}
		sc.close();
		System.out.println("\nArray elements are,");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n\nMaximim element from the array is ===> "+max);

	}

}
