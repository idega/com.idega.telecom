package com.idega.telecom.webservice.client;

import java.text.SimpleDateFormat;

import com.idega.util.IWTimestamp;

public class TestClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestClient client = new TestClient();
		client.doStuff();
	}

	private void doStuff() {
		try {
			//String endpoint = "http://vala.reykjavik.is/WSLeikskoli/WSLeikskoliSoapHttpPort";

			WebServiceCDRatorLocator locator = new WebServiceCDRatorLocator();
			WebServiceCDRatorSoap_PortType port = locator.getWebServiceCDRatorSoap();
			//((org.apache.axis.client.Stub) port).setTimeout(2000);
			
			User user = port.userGetByNumberAndPassword("8671374", "uaga22");//userGetByNumber("8671374");
			if (user == null) {
				System.out.println("user is null");
			}
			
			Phone phone = port.phoneGetByNumber("8671374");
			System.out.println(Float.toString(phone.getBalance()));
			System.out.println(phone.getStartDate());
			
			SimpleDateFormat sdfDestination = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
			IWTimestamp stamp = new IWTimestamp(sdfDestination.parse(phone.getStartDate()));
			
			System.out.println("stamp = " + stamp.toString());
			
			
			/*FriendNumber numbers[] = port.friendsGetByNumber("8671374");
			for (int i = 0; i < numbers.length; i++) {
				System.out.println("friend " + i + " = " +numbers[i].getNumber() + " " + numbers[i].getEndDate());
			}*/
			System.out.println("" + user.getGsmPhone());
			//System.out.println(port.testHelloWorld());
			
			
			//port.
			

		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}