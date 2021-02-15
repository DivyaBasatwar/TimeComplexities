package bigOh_logN;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static void binarySearch(int[] arr, int key, int start, int end) {
		boolean found = false;
		while(start<=end && found==false) {
			int mid = (start+end)/2;
			
			if(arr[mid]==key) {
				found = true;
				break;
			}
			else if(arr[mid]<key) {
				start = mid+1;
			}
			else {
				end = mid-1;
			}
		}
		
		if(found==true) {
			System.out.println("Entered element is present in the array");
		}
		else {
			System.out.println("Entered element is not present in the array");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array ===> ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the "+n+" elements of an array");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array elements are,");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\nEnter the element which you want to search");
		int key = sc.nextInt();
		sc.close();
		Arrays.parallelSort(arr);
		
		binarySearch(arr, key, 0, n-1);

	}

}
