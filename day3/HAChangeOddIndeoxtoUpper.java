package week1.day3;

public class HAChangeOddIndeoxtoUpper {

	public static void main(String[] args) {
		String test = "changeme";
		System.out.println("The given input string is: "+test);
		
		//Converted the given String to a character array
		char[] CharArray = test.toCharArray();
		
		//Implemented a loop to iterate through each character of the String from end to start
		for (int i = CharArray.length-1; i >=0; i--) {
			
			//Finding the odd index within the loop
		    if(i % 2 != 0) {
		    	
		    	//changed the character to uppercase only if the index is odd
			    	CharArray[i] = Character.toUpperCase(CharArray[i]);
			    }
		}
		
		//Print the characters with the expected output
	   String result = new String(CharArray);
		    	
				System.out.println("The result of Changed odd index to upper case as:"+result);
			
		}

	}


