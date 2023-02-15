package pages;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import common.Base;
import common.locators;

public class login extends Base{

	
	
	public void doLogin(String un, String pw) throws InterruptedException {

		driver.findElement(locators.userBox).sendKeys(un);
		driver.findElement(locators.passBox).sendKeys(pw);
		driver.findElement(locators.loginBtn).click();
		Thread.sleep(2000);
		
	}
	
}
