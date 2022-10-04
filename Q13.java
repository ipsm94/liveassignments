package AssignmntSep;

public class Q13 {

	public static void main(String[] args) {

		int [] array1 = {1,2,4,5,6};
		System.out.println("The pairs are: ");
		
		for(int i=0;i<4;i++) {
			for(int j=i+1;j<5;j++) {
				if(array1[i]+array1[j]==6) {
					System.out.println(array1[i]+" and "+array1[j]);
				}
			}
		}

	}

}
