package week2.day3;

public class HAPolyAPIClient {
	
	public void sendRequest(String endpoint) {
		
		System.out.println("This method is for  the endpoint");
	}
	
	public void sendRequest(String endpoint, String  requestBody, boolean  requestStatus) {
		
		System.out.println("This method is for the  endpoint:"+endpoint+"requestBody:"+requestBody+" and requestStatus:"+requestStatus);
	}

	public static void main(String[] args) {
		
		HAPolyAPIClient poly = new HAPolyAPIClient();
		poly.sendRequest("/redfish/v1");
		poly.sendRequest("/redfish/v1/test", "Name: Validation", true);
		
	}

}
