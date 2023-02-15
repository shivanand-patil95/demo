package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import common.Base;
import pages.login;

public class loginTest extends Base{

	login lg;
	
	@Test
	@Parameters({"username","password"})
	public void logintest(String un1, String pw1) throws InterruptedException {
		lg= new login();
		lg.doLogin(un1, pw1);
	}
	
	
	
	
}
