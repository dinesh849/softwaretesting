package testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.objs.Methods;

public class TC001 {
	
// public static void main(String args[])  throws Exception {
	@Test
	public void high () throws Exception {
		
	DOMConfigurator.configure("log4j.xml");
	
	Methods obj = new Methods();
	obj.openapp();
	obj.login();
	obj.logout();
	obj.closeapp(); 
	
	}
    }
