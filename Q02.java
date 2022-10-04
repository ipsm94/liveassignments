package AssignmntSep;

public class Q02 {

	public static void main(String[] args) {

		int [] array1 = {3,4,5,7,9};
		
		float sum =0;
		for(int i=0;i<5;i++) {
			sum += array1[i];
		}
		float average =  sum/array1.length;
		
		System.out.println("The average is: "+ average);

	}

}
