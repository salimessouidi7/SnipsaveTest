package login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseclass.BaseClass;

public class Login {
	WebDriver driver = BaseClass.getWebDriver();
	
	public void login() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement login = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log In")));
		login.click();
		
		WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("field_email")));
		email.sendKeys("salimessouidi7@gmail.com");
		WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("field_password")));
		password.sendKeys("salim@1234");
		WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.name("submit")));
		button.click();
	}
}
