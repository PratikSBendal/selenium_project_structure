package creditfair_website_config;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.cdimascio.dotenv.Dotenv;

public class WebsiteBrowswer {
	public static WebDriver driver;
	protected String clientid;
	protected String clientsecret;
	protected String mailgundomain;
	protected String mailgunsecret;


	public static WebDriver getDriver() throws MalformedURLException {
		if (driver == null) {
			System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
			FirefoxOptions options = new FirefoxOptions();
			options.setHeadless(false);
			driver = new FirefoxDriver();
//			System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
//			ChromeOptions option = new ChromeOptions();
//			option.addArguments("--remote-allow-origins=*");
//			option.setHeadless(false);
//		    driver = new ChromeDriver(option);
//          driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options); 
			driver.get("https://testpwa.creditfair.in");
			driver.manage().window().maximize();
			
			// For Docker Run
//			FirefoxOptions options = new FirefoxOptions();
//			options.setHeadless(true);
//			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options); 
//			driver.get("https://creditfair.in/admin");
		}
		return driver;

	}
	

}
