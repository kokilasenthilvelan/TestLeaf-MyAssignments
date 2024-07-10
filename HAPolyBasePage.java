package week2.day3;

public class HAPolyBasePage {
	
	public void  findElement() {
		System.out.println("This is findElement() method from class HAPolyBasePage");
		
	}
	
    public void  clickElement() {
    	System.out.println("This is clickElement() method from class HAPolyBasePage");
		
	}


    public void  enterText() {
    	System.out.println("This is enterText() method from class HAPolyBasePage");
	
    }
    
    public void performCommonTasks() {
    	System.out.println("This is performCommonTasks() method from class HAPolyBasePage");
    	
    }
    
    public static void main(String[] args) {
    	
    	HAPolyBasePage base = new HAPolyBasePage();
    	base.performCommonTasks();
    }

}
