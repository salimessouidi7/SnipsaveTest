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
		
		WebElement firstname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("field_first_name")));
		firstname.sendKeys("Salim");
		WebElement lastname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("field_last_name")));
		lastname.sendKeys("Souidi");
		WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("field_email")));
		email.sendKeys("salimessouidi7@gmail.com");
		WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("field_password")));
		password.sendKeys("salim@1234");
		WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.name("submit")));
		button.click();
		
	}
}
