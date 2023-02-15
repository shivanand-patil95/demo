package common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.*;

public class Base {

	public static WebDriver driver;
	Base base;

	@BeforeSuite
	public void beforeSuit() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		base = new Base();
	}

	@BeforeMethod
	public void beforeTest() throws IOException {
		driver.get(base.getProperrty());
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

	public String getProperrty() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Shivanand Patil\\eclipse-workspace\\helpSwitch\\src\\test\\resources\\resources\\config.properties");
		prop.load(fis);
		String URL = prop.getProperty("url");
		return URL;
	}

	@DataProvider(name = "test")
	public Object[][] testData() {

		Object[][] arr = { { "", "" }, { "", "demo" }, { "demo", "" }, { "demo", "demo" } };
		return arr;
	}
}
