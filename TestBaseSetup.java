package basesetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class TestBaseSetup {

	private static WebDriver driver;
	public static String browserType = "Firefox";
	public static String appURL = "https://uptake.com/";
	
	public static WebDriver getDriver() {
		return driver;
	}

	protected static void setDriver(String browserType, String appURL) {
		driver = initFirefoxDriver(appURL);
	}

	private static WebDriver initFirefoxDriver(String appURL) {
		System.out.println("Launching Firefox browser with new profile..");
		System.setProperty("webdriver.gecko.driver", "/Users/Natalya/Documents/workspace/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}

	@BeforeClass
	public static void initializeTestBaseSetup() {
		try {
			setDriver(browserType, appURL);
		} catch (Exception e) {
			System.out.println("Error....." + e.getStackTrace());
		}
	}
	
	@AfterClass
	public static void tearDown() {
		driver.quit();
	}
}
