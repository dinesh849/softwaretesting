package testscripts;

import com.hrms.objs.Methods;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

public class TC002 {
	
@Test
	public static void jen() throws Exception {
		DOMConfigurator.configure("log4j.xml");
		Methods obj = new Methods();
		obj.openapp();
		obj.login();
		obj.addemployee();
		obj.logout();
		obj.closeapp();
		
	}
}
