package login;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseclass.BaseClass;

public class ResetPassword {
	WebDriver driver = BaseClass.getWebDriver();
	
	public void resetPassword() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement login = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log In")));
		login.click();
		
		WebElement resetPwd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("I forgot my password")));
		resetPwd.click();
		
		WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("field_email")));
		email.sendKeys("salimessouidi7@gmail.com");
		
		WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.name("submit")));
		button.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/section[2]/div/div")));
		String emailMessage = BaseClass.getWebDriver().findElement(By.xpath("/html/body/div/div/div/section[2]/div/div/p[1]/strong")).getText();
		//System.out.println(emailMessage);
		assertEquals(emailMessage, "Please check your email for a link to change your password.");
		
	}
}
