package AssignmntSep;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number: ");
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i =0; i<n; i++) {
			
			System.out.println("Enter number: ");
			arr[i] = sc.nextInt();
		}
		System.out.println("After reversal : ");
		for(int j=n-1; j>=0; j--)
		{
			System.out.print(arr[j] +" ");
		}
		
		
	}

}
