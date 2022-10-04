package AssignmntSep;

public class Q10 {

	public static void main(String[] args) {

		int [] array1 = {1,2,3,4,6,7,8};
		
		float totalNum = 8;
		float expectedSum = totalNum*((totalNum+1)/2);
		float initialSum = 0;
		for(int sum:array1) {
			initialSum += sum;
		}
		float missingNumber = expectedSum - initialSum;
		System.out.println(expectedSum);
		System.out.println("The missing number is: "+ (int)missingNumber);

	}

}
