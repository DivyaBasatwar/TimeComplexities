package bigOh_1;
import java.util.Scanner;
public class CheckForEvenAndOddNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number ===> ");
		int n = sc.nextInt();
		sc.close();
		if(n<0) {
			System.out.println("Input Should Be Greater Than Zero");
		}
		else if(n%2==0) {
			System.out.println("****Even Number****");
		}
		else {
			System.out.println("****Odd Number****");
		}
	}

}
