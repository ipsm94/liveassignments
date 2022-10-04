package AssignmntSep;

public class Q11 {

	public static void main(String[] args) {

		int [] array1 = {2,4,8};
		int [] array2 = {2,3,4,8,10,16};
		int [] array3 = {4,8,14,40};
		
		System.out.println("The common elements are: ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<6;j++) {
				for (int k=0;k<4;k++) {
					if(array1[i]==array2[j] && array1[i]==array3[k]) {
						System.out.println( array1[i]);
					}
				}
			}
		}

	}

}
