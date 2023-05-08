package pages;

import org.openqa.selenium.By;

public class RokomariHomePage extends BasePage{
	public String HOMEPAGE_URL = "https://www.rokomari.com/book";
	public By SIGNUP_LOGIN_BUTTON = By.xpath("//a[contains(text(),'Sign in')]");
	public By SIGNUP_BUTTON = By.xpath("//p[contains(text(),'Sign up')]");
	public By SIGNUP_WITH_GOOGLE_BUTTON = By.xpath("//div[@id='js--login-form']/div[1]/div[1]/button[2]");
	public By GOOGLE_ACCOUNT = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]");
	public By AUTHOR_BUTTON = By.xpath("//a[@id='js--authors']");
	
}
