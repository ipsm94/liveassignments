package AssignmntSep;

import java.util.*;

public class LinkedListHw01 {

	public static void main(String[] args) {

		LinkedList testll = new LinkedList();
		//Add element at last
		testll.add("Ranil");
		testll.add("Hiran");
		System.out.println(testll);
		
		testll.addLast(9);
		//Add element at Firstst
		testll.addFirst("Std 4");
		System.out.println(testll);
		
		//Add element at given position index
		testll.add(3, "age");
		System.out.println(testll);
		
		//Update element at given index position
		testll.set(4, 10);
		System.out.println(testll);
		
		//Delete first element
		testll.removeFirst();
		System.out.println(testll);
		
		//Delete last element
		testll.add(0,"Hiran");
		testll.removeLast();
		System.out.println(testll);
		
		//Add one and then Delete element from given position
		testll.add(0, 99);
		testll.add(5, 9);
		testll.remove("Hiran");
		testll.remove(3);
		
		//Display all elements
		System.out.println(testll);
	}

}
