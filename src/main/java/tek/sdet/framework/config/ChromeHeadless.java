package tek.sdet.framework.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeHeadless implements Browser {

	
	public WebDriver openBrowser(String url) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--headless");
		WebDriver driver = new FirefoxDriver(options);
		driver.get(url);
		return driver;
	}

}