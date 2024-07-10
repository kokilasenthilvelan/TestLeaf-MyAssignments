package week2.day3;

public class HAButtonC extends HAWebElementGP {

	public void Submit() {
		System.out.println("Printing Submit from Parent1 Button");
	}
	
	public static void main (String [] args) {
		
		HAButtonC button1 = new HAButtonC();
		button1.click();
		button1.Submit();
		button1.SetText();
	}
}
