package loginTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.BaseClass;
import login.Login;

public class LoginTest {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		BaseClass BC = new BaseClass();
		BC.setUp();
		driver = BaseClass.getWebDriver();
	}
	
	@Test
	public void loginTest() {
		Login SP = new Login();
		SP.login();
	}
	
	//@AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
