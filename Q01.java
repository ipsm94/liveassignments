package AssignmntSep;

import java.util.Arrays;

public class Q01 {

	public static void main(String[] args) {

		int [] array1 = {1789,2035,1899,1456,2013};
		String [] array2 = {"Python", "Java", "Ruby", "Php"};
		
		System.out.println("Orginal numeric array: "+ Arrays.toString(array1));
		Arrays.sort(array1);
		System.out.println("Sorted numeric array: "+ Arrays.toString(array1));
		System.out.println("Original string array: "+ Arrays.toString(array2));
		Arrays.sort(array2);
		System.out.println("Sorted string array: "+ Arrays.toString(array2));

	}

}
