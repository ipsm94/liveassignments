package AssignmntSep;

import java.util.Scanner;

///Write a prog to accept rows and columns of multidimensional array from keyboard and initialize array.
///Accept the array elements from user interface from user, then display in a matrix form

public class ArrayElemDemo {

	public static void main(String[] args) {

		System.out.println("Enter the Dimension of Matrix ! ");

		Scanner sc = new Scanner(System.in);
		
        System.out.println("Enter number of rows:");
        int nrows = sc.nextInt();
        
        System.out.println("Enter number of columns:");
        int ncol = sc.nextInt();
				
        System.out.println("Enter array elements:");
        int[][] matArray = new int[nrows][ncol];
				
				
        for(int i=0;i<nrows;i++) {
        	for(int j=0;j<ncol;j++) {
        		matArray[nrows][ncol] = sc.nextInt();
        	}
        }
        /*******
        for(int i=0;i<nrows;i++) {
        	for(int j=0;j<ncol;j++) {
        		System.out.print(matArray[i][j]+" ");
        	}
        	System.out.println();
        } 
        *********/
	}

}
