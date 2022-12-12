package test;


import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetWebDriver {

	static WebDriver driver;

	public static void main(String[] args) {
			String browserName = "chrome";

			if (browserName.equals("chrome")) {
				//System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			} else if (browserName.equals("edge")) {
				//System.setProperty("webdriver.edge.driver", "Drivers//msedgedriver.exe");
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}else if (browserName.equals("gecko")) {
				//System.setProperty("webdriver.gecko.driver", "Drivers//geckodriver.exe");			
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			
			}
	
		
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

	}

}
