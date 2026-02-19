package logintestcases;

import org.testng.annotations.Test;

import basesclass.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {
	
@Test
	public void logintest() throws InterruptedException {
		
	
	LoginPage  lp = new  LoginPage(driver);
	
	lp.usernametext();
	lp.passwordtext();
	lp.checkboxbtn();
	lp.loginbtn();
	
}
	
}
