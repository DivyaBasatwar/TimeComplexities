package bigOh_N;
import java.util.Scanner;
public class SumOfAllElementsOfAnArray {

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
		
		int sum = 0;
		
		System.out.println("Enter the "+n+" elements of an array");
		for(int i=0;i<n;i++) {
			System.out.print("\nEnter the element at position "+(i+1)+" ===> ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		sc.close();
		System.out.println("\nSum of all elements of an array is ===> "+sum);
	
	}

}
