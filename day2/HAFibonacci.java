package week1.day2;

public class HAFibonacci {

	public static void main(String[] args) {
		int n = 5;
		int a = 0,b = 1;
		System.out.println("Th Fibonacci series for "+n+" is below ");
		for (int i = 0
				; i <= n; ++i) {		
			int c = a+b;
			a = b;
			b = c;	
			System.out.println(a+ " ");
		}
		
		
	}

}
