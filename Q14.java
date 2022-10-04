package AssignmntSep;

public class Q14 {

	public static void main(String[] args) {

		int [] array1 = {1,-2,0,5,-1,-4};
		System.out.println("The pairs are: ");
		
		for(int i=0;i<4;i++) {
			for(int j=i+1;j<5;j++) {
				for(int k=j+1;k<6;k++) {
					if(array1[i]+array1[j]+array1[k]==2) {
						System.out.println(array1[i]+ " , "+array1[j]+" and "+array1[k]);
					}
				}
			}
		}

	}

}
