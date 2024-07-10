package week2.day3;

public class HACheckBoxButtonC extends HAButtonC {
	
	public void clickCheckButton() {
		System.out.println("Printing clickCheckButton from Child1 CheckBoxButton");
	}

	public static void main (String[] args) {
		
		HACheckBoxButtonC button3 = new HACheckBoxButtonC();
		button3.Submit();
		button3.clickCheckButton();
		
	}
}
