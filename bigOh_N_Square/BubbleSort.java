package bigOh_N_Square;
import java.util.Scanner;
public class BubbleSort {

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
		
		System.out.println("\nArray elements before sorting");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		//Code for bubble sort
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println("\n\nArray elements After sorting");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
