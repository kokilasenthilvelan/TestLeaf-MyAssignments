package week2.day4;

import java.util.ArrayList;
import java.util.Collections;

public class HASortingUsingCollection {

	public static void main(String[] args) {
		
		ArrayList<String> C = new ArrayList<>();
		C.add("HCL");
		C.add("Wipro");
		C.add("Aspire Systems");
		C.add("CTS");
		
		System.out.println("Before Sort:"+C);
		Collections.sort(C);
		System.out.println("After Sort:"+C);
	    
		System.out.println("Sort in Descending:");
		//Iterate the values in the list and Print the required output as Wipro, HCL, CTS, Aspire Systems
		for (int i = C.size() - 1; i >= 0; i--) {
            System.out.println(C.get(i));
			}
	}

}
