package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage
{
	//The elements used in the test case
	protected WebDriver driver;
	private By companyLogo = By.className("mainLogo");
	private By approachLink = By.linkText("Approach");
	
	/*Other elements on the Home page:
	private By productsLink = By.linkText("Products");
	private By industriesLink = By.linkText("Industries");
	private By newsroomLink = By.linkText("Newsroom");
	private By beyondUptakeLink = By.linkText("Beyond.Uptake");
	private By blogLink = By.linkText("Blog");
	private By executiveBriefingButton = By.xpath(".//*[@id='header']/div[1]/div[2]/button");
	
	private By learnAboutOurPlatformButton = By.xpath(".//*[@id='home']/div[1]/div/div[1]/div/button");
	private By learnAboutOurApproachButton = By.xpath(".//*[@id='home']/div[2]/div/div[1]/div/button");
	private By seeTheIndustriesWeServeButton = By.xpath(".//*[@id='home']/div[3]/div/div[1]/div/button");
	private By getInTouchButton = By.xpath(".//*[@id='home']/div[4]/div/div[1]/div/button");
	
	private By getInTouchFooterLink = By.xpath(".//*[@id='footer']/div[1]/div[1]/h6/a");
	private By twitterIcon = By.xpath(".//*[@id='footer']/div[1]/div[2]/a[1]/img");
	private By instagramIcon = By.xpath(".//*[@id='footer']/div[1]/div[2]/a[2]/img");
	private By linkedinIcon = By.xpath(".//*[@id='footer']/div[1]/div[2]/a[3]/img");
	private By privacyPolicyLink = By.linkText("Privacy Policy");
	private By careersLink = By.linkText("Careers");
	private By contactButton = By.linkText("Contact");
	*/
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		
	}
	
	public HomePage clickCompanyLogo(){
		System.out.println("clicking on Company Logo");
		WebElement companyLogoElement=driver.findElement(companyLogo);
		if(companyLogoElement.isDisplayed()||companyLogoElement.isEnabled())
			companyLogoElement.click();
		else System.out.println("Element not found");
		return new HomePage(driver);
	}
	
	public ApproachPage clickApproachLink(){
		System.out.println("clicking on Approach Link");
		WebElement approachLinkElement=driver.findElement(approachLink);
		if(approachLinkElement.isDisplayed()||approachLinkElement.isEnabled())
			approachLinkElement.click();
		else 
			System.out.println("Element not found");
		return new ApproachPage(driver);
	}
	
	public String getPageTitle(){
		System.out.println("Getting Home Page Title");
		String title = driver.getTitle();
		return title;
	}
	
	public boolean verifyHomePageTitle() {
		System.out.println("Verifying Home Page Title");
		String expectedPageTitle="Analytics for the industrial internet";
		//System.out.println(getPageTitle().contains(expectedPageTitle));
		return getPageTitle().contains(expectedPageTitle);
	}
}
