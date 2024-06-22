package week1.day3;

import java.util.Arrays;

public class ClassroomFindDups {

	public static void main(String[] args) {
		
//Using nested for loop
//		int[] num = {2, 5, 7, 7, 5, 9, 2, 3};
//		for (int i = 0; i < num.length-1; i++) {
//			for (int j = i+1; j < num.length; j++) {
//			   if(num[i]==num[j]) {
//		       System.out.println(num[j]);
//
//	}
//			}
//		}
//Using Array sort
		int[] num = {2, 5, 7, 7, 5, 9, 2, 3};
		Arrays.sort(num);
		for (int i = 0; i < num.length-1; i++) {
			//System.out.println("first value"+num[i]);
			//System.out.println("second value"+num[i+1]);
			if(num[i]==num[i+1]) {
				System.out.println(num[i]);
			}
		}
		
		
}
}
