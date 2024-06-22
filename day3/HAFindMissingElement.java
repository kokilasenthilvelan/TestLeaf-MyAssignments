package week1.day3;

import java.util.Arrays;

public class HAFindMissingElement {

	public static void main(String[] args) {
		int[] a = {1, 4, 3, 2, 8, 6, 7};
		int missingnumber = -1;
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			if(a[i] != i+1) {
				missingnumber = i+1;
		        System.out.println("Missing Number in the given array is "+missingnumber);
		        break;
			}

	}

}
}