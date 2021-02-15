package bigOh_N_Square;

import java.util.Scanner;

public class HasDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array ===> ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the "+n+" elements of an array");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int i = 0, j = 0;
		
		boolean flag = false;
		
		for(i=0;i<n-1;i++) {
			for(j=i+1;j<n;j++) {
				if(i!=j && arr[i]==arr[j]) {
					flag = true;
					break;
				}
			}
			if(flag==true) {
				System.out.println("Array has duplicates");
				return;
			}
		}
		
		System.out.println("Array does not has duplicates");

	}

}
