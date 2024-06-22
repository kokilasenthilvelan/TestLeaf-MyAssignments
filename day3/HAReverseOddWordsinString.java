package week1.day3;

public class HAReverseOddWordsinString {

	public static void main(String[] args) {
		String test = "I am a software tester";
		System.out.println("Input string given: "+test);
		
		//Split the words into an array and traverse through each word using loop
		String[] split = test.split(" ");
		String output = "";
		
		for (int i = 0; i < split.length; i++) {
			//Finding the odd index within the loop
			if( i % 2 != 0) {
			char[] CharArray = split[i].toCharArray();
			for (int j = CharArray.length-1; j >=0; j-- ) {
			output = output  + CharArray[j];
			}
			} else {
				//Increment the word if it is even
				output = output + split[i];			
		}
			//Add space  after each word except last one
			if (i < split.length - 1) {
				//output += " ";
				output = output + " ";
		}
		}
		System.out.println("Expected output: "+output);
		}

	}






