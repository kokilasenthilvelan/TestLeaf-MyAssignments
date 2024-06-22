package week1.day3;

public class HARemoveDuplicateWordsinString {

	public static void main(String[] args) {
		
		String text = "We learn Java basics as part of java sessions in java week1";
		System.out.println("The input text is: "+text );
		
		//Initialized a variable ‘count’ to keep track of the number of duplicate words found
	    int count =0;
	    
	    //Splited the text into an array of words using space as the delimiter
	    String[] split = text.split (" ");
	    
	    //Created two nested for loops to compare each word with every other word in the String array.
	    for (int i = 0; i < split.length; i++) {
	    	for (int j = i+1; j < split.length; j++ ) {
	    		
	    		//If a duplicate word is found(without case sensitive used equalsIgnoreCase, it is replaced with an empty string and the count is incremented
	    		if (split[i].equalsIgnoreCase(split[j])) {	
	    			split[j]= " ";
	    			count++;
	    		}
	    	}	
	    }
	    
	    // After comparing all words, If the count is greater than 1 (indicating at least one duplicate was found), it prints 
	    //the modified words array where duplicates have been replaced with empty strings.

	    if(count > 1) {
	    	System.out.print("Expected Output:");
	    	for (int i = 0; i < split.length; i++) {
	    		if(!split[i].isEmpty()) {
	    			System.out.print(split[i] + " ");
	    			
	    		}
	    	}
	    }
	}
}
