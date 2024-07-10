package week2.day4;

public class HAIntersection {

	public static void main(String[] args) {
		int[] A1 = {3, 2, 11, 4, 6, 7};
		int[] A2 = {1, 2, 8, 4, 9, 7};
		
		System.out.println("Common values are:");
		for(int i = 0; i<A1.length; i++) {
			for(int j=0; j<A2.length; j++) {
				if (A1[i]==A2[j]) {
					System.out.println(A1[i]);
				}
					
			}
			
		
		}
					
		}
		

	}

