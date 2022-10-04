package AssignmntSep;

import java.util.Arrays;

public class Q06 {

	public static void main(String[] args) {

		int [] array1 = {10789,2035,1899,1456,2013};
		
		Arrays.sort(array1);
		
		int secondLargestValue = array1[array1.length-2];
		System.out.println("The 2nd largest value is: "+ secondLargestValue);
	}

}
