package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ApproachPage
{
	//The elements used in the test case
	protected WebDriver driver;
	private By companyLogo = By.className("mainLogo");
	
	/* Other elements on the Approach page: 
	private By approachLink = By.linkText("Approach");
	private By productsLink = By.linkText("Products");
	private By industriesLink = By.linkText("Industries");
	private By newsroomLink = By.linkText("Newsroom");
	private By beyondUptakeLink = By.linkText("Beyond.Uptake");
	private By blogLink = By.linkText("Blog");
	private By executiveBriefingButton = By.xpath(".//*[@id='header']/div[1]/div[2]/button");

	private By intelligenceIcon = By.linkText("Intelligence");
	private By speedIcon = By.linkText("Speed");
	private By scaleIcon = By.linkText("Scale"); 
	private By openPositionsBtn = By.linkText("Open Positions");	

	private By getInTouchFooterLink = By.xpath(".//*[@id='footer']/div[1]/div[1]/h6/a");
	private By twitterIcon = By.xpath(".//*[@id='footer']/div[1]/div[2]/a[1]/img");
	private By instagramIcon = By.xpath(".//*[@id='footer']/div[1]/div[2]/a[2]/img");
	private By linkedinIcon = By.xpath(".//*[@id='footer']/div[1]/div[2]/a[3]/img");
	private By privacyPolicyLink = By.linkText("Privacy Policy");
	private By careersLink = By.linkText("Careers");
	private By contactButton = By.linkText("Contact");
	*/
	
	public ApproachPage(WebDriver driver){
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
	
	public String getPageTitle(){
		System.out.println("Getting Approach Page Title");
		String title = driver.getTitle();
		return title;
	}
	
	public boolean verifyApproachPageTitle() {
		System.out.println("Verifying Approach Page Title");
		String expectedPageTitle="Approach";
		return getPageTitle().contains(expectedPageTitle);
	}
}
