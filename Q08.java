package AssignmntSep;

import java.util.Arrays;

public class Q08 {

	public static void main(String[] args) {

		int [] array1 = {2,5,7,9,11};
		int [] array3 = {2,5,7,9,11};
		
		boolean equality = Arrays.equals(array1, array3);
		
		if(equality == true) {
			System.out.println("Two arrays are equal");
		}

	}

}
