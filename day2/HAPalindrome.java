package week1.day2;

public class HAPalindrome {

	public static void main(String[] args) {
		int n = 121;
		int p = 0;
		for (int i = n; i > 0; i = i/10) {
			int m = i%10;
			p = (p*10) + m;
		}
		
		if (n==p) {
			System.out.println("The given input is "+n+" and the output is "+p+" So, It is a palindrome number");
		} else {
			System.out.println("The given input is "+n+" and the output is "+p+" So, It is not a palindrome number");
			
		}

	}

}
