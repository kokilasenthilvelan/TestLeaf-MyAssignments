package week1.day2;

public class ClassroomPrime {

	public static void main(String[] args) {
		int n  = 13;
		boolean flag = true;
		for(int i = 2; i < n; i++) {
			if(n%i==0)
			{ 
				flag = false; 
				break;
			}
		}
		if(flag==true){
			System.out.println(n+ " is a prime number");
		}else{
			System.out.println(n+ " is not a prime number");
		}
					
}
}
