package week2.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HAMissingElementINArray {

	public static void main(String[] args) {
		
		// Step 1: Declare and initialize an array
		Integer[] M =  {1, 2, 3, 4, 10, 6, 8};
		
		// Step 2: Convert the array to a list
		List<Integer> M1 = new ArrayList<>(Arrays.asList(M));
		
		//Sort in Ascending
		Collections.sort(M1);
		
		System.out.println("After sort:"+M1);
		System.out.println("Missing Element in an ArrayList are as below:");
		for (int i =0; i<M1.size()-1;i++) {
			int first = M1.get(i);
			int second = M1.get(i+1);
			if ( first +1 != second) {
				for ( int missing = first+1;missing<second;missing++) {
					System.out.println(missing);
				}
			}
		}
	}

}
