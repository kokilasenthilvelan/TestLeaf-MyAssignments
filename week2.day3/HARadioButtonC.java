package week2.day3;

public class HARadioButtonC extends HACheckBoxButtonC{
	
	public void selectRadioButton() {
		System.out.println("Printing selectRadioButton from Child2 RadioButton");
	}
	
public static void main (String[] args) {
		
		HARadioButtonC button4 = new HARadioButtonC();
		button4.Submit();
		//button4.clickCheckButton();

}
}
