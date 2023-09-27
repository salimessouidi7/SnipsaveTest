package baseclass;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	static WebDriver driver;
	public static void setUp() {
		// Set up ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Create an instance of ChromeDriver
        driver = new ChromeDriver();
        
        driver.manage().window().maximize();

	}
	
	public static WebDriver getWebDriver() {
		if (driver == null) {
            setUp();
        }
		return driver;
	}
}
