package AssignmntSep;

public class Q07 {

	public static void main(String[] args) {

		int [] array1 = {2,7,4,-5,11,5,20};
		System.out.println("The pairs are: ");
		for(int i=0;i<6;i++) {
			for(int j=i+1;j<7;j++) {
				if(array1[i]+array1[j]==15) {
					System.out.println(array1[i] + " and "+ array1[j]);
				}
			}
		}

	}

}
