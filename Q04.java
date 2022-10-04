package AssignmntSep;

public class Q04 {

	public static void main(String[] args) {

		int [] array1 = {5,2,7,7,5};
		System.out.println("The duplicate elements are: ");
		for(int i=0;i<4;i++) {
			for(int j=i+1;j<5;j++) {
				if(array1[i]==array1[j] && i!=j){
					System.out.println(array1[i]);
				}
			}
		}
	}

}
