package loginTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.BaseClass;
import login.ResetPassword;

public class ResetPasswordTest {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		BaseClass BC = new BaseClass();
		BC.setUp();
		driver = BaseClass.getWebDriver();
	}
	
	@Test
	public void resetPasswordTest() {
		ResetPassword SP = new ResetPassword();
		SP.resetPassword();
	}
	
	//@AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
