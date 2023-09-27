package signupTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.BaseClass;
import signup.SignUp;

public class SignUpTest {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		BaseClass BC = new BaseClass();
		BC.setUp();
		driver = BaseClass.getWebDriver();
	}
	
	@Test
	public void signUpTest() {
		SignUp SP = new SignUp();
		SP.singUp();
	}
	
	//@AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
