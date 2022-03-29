package com.hrms.objs;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import utility.Log;


public class Methods extends Data {
	
	    public void openapp () {
			 System.setProperty("webdriver.chrome.driver", path);
			 d = new ChromeDriver();
			 d.navigate().to(url);
			 System.out.println("opened application");
			 Log.info("opened");
			 
			 }
		

		public void closeapp () {
			d.close();
			Log.info("closed");
			
		}
		

		public void login () throws Exception {
			d.findElement(By.name(txtuserName)).sendKeys(username);
			Thread.sleep(1200);
			d.findElement(By.name(txtpassword)).sendKeys(password);
			Thread.sleep(1200);
			d.findElement(By.name(login_button)).click();
		Reporter.log(Employeefirstname);
		}
		

		public void logout () {
			d.findElement(By.linkText(logout_button)).click();
			
		}
		
		public void addemployee () {
			d.switchTo().frame(frame);
			d.findElement(By.xpath(add_button)).click();
			d.findElement(By.name(Employeefirstname)).sendKeys(EFN);
			d.findElement(By.name(Employeelastname)).sendKeys(ELN);
			d.findElement(By.id(save_button)).click();
			d.switchTo().defaultContent();
			
		}
	}


