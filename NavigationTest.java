package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import basesetup.TestBaseSetup;
import pageobjects.*;

public class NavigationTest extends TestBaseSetup
{
	private static WebDriver driver;
	
	@BeforeClass 
	public static void setUp() {
		System.out.println("Home page setup...");
		driver=getDriver();	
	}
	
	@Test
	public void verifyHomePage() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		System.out.println("Navigation between Home page-Approach page-Approach/Intelligence page test...");
		System.out.println("Varifying Home page");
		HomePage homePage = new HomePage(driver);
		//verifying that you are on the Home page
		Assert.assertTrue("Home page title doesn't match", homePage.verifyHomePageTitle());

		//navigate to Approach Page from Home page
		System.out.println("Navigating to Approach Page from Home page");
		ApproachPage approachPage = homePage.clickApproachLink();
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='approach']/div[2]/div/div/div[1]"), "The Uptake difference:"));
		//verifying that you are on the Approach Page
		Assert.assertTrue("Approach page title doesn't match", approachPage.verifyApproachPageTitle());
		
		//navigate back to Home Page from Approach Page clicking on the Uptake Logo
		System.out.println("Navigating back to Home Page from Approach Page clicking on Uptake Logo");
		homePage = approachPage.clickCompanyLogo();
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='home']/div[1]/div/div[1]/div/div[1]"), "Let's put your data to work"));
		//verifying that you are on the Home Page
		Assert.assertTrue("Approach page title doesn't match", homePage.verifyHomePageTitle());
	}		
}
