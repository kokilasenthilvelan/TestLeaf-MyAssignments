package week2.day4;

import java.util.ArrayList;
import java.util.Collections;

public class HASecondLargestINArray {

	public static void main(String[] args) {
		
		ArrayList<Integer> A = new ArrayList<>();
		A.add(3);
		A.add(2);
		A.add(11);
		A.add(4);
		A.add(6);
		A.add(7);
		
		System.out.println("Before Sort:"+A);
		Collections.sort(A);
		System.out.println("After Sort:"+A);
		
		int SecondLarge = A.get(A.size()-2);
		System.out.println("Second Largest number in given ArrayList is:"+SecondLarge);

	}

}
