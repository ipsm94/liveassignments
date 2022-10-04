package AssignmntSep;

import java.util.ArrayList;

public class Q09 {

	
	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("Python");
		arrayList.add("JAVA");
		arrayList.add("PHP");
		arrayList.add("PERL");
		arrayList.add("C#");
		
		String [] array1 = new String[arrayList.size()];
		arrayList.toArray(array1);
		
		for(String str:array1) {
			System.out.println(str);
		}

	}

}
