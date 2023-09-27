package signup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseclass.BaseClass;


public class SignUp {
	WebDriver driver = BaseClass.getWebDriver();
	public void singUp() {
		// Navigate to a website
        driver.get("https://www.snipsave.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement signupBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/header/div[2]/a[1]")));
		signupBtn.click();
	
	//driver.findElement(By.xpath("/html/body/div/header/div[2]/a[1]")).click();
	}
}
