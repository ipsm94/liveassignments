package AssignmntSep;

public class Q03 {

	public static void main(String[] args) {

		int [] array1 = {53,32,19,79,25,5,47};
		
		int maximumValue =0;
		for(int i=0;i<7;i++) {
			if(array1[i]>maximumValue) {
				maximumValue = array1[i];
			}
		}
		int minimumValue = Integer.MAX_VALUE;
		for(int i=0;i<7;i++) {
			if(array1[i]<minimumValue) {
				minimumValue = array1[i];
			}
		}
		System.out.println("The maximum value is: "+maximumValue);
		System.out.println("The minimum value is: "+minimumValue);

	}

}
