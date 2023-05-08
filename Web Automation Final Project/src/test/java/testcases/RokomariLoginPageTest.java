package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.RokomariHomePage;
import pages.RokomariLoginPage;
import utilities.BaseDriverSetup;
import utilities.DataSet;

public class RokomariLoginPageTest extends BaseDriverSetup{
	RokomariHomePage rokomariHomePage = new RokomariHomePage();
	RokomariLoginPage rokomariLoginPage = new RokomariLoginPage();
	
	
	@Test(dataProvider = "invalidCredentials", dataProviderClass = DataSet.class)
	public void testLoginwithInvalidPhoneNumber(String username, String password, String ErrorMessage) {
		getDriver().get(rokomariHomePage.HOMEPAGE_URL);
		rokomariHomePage.clickOnElement(rokomariHomePage.SIGNUP_LOGIN_BUTTON);
		rokomariLoginPage.wirteTex(rokomariLoginPage.PHONE_EMAIL_INPUT_FIELD, username);
		rokomariLoginPage.wirteTex(rokomariLoginPage.PASSWORD_INPUT_FIELD, password);
		rokomariLoginPage.takeScreenShot("Login Info");
		rokomariLoginPage.clickOnElement(rokomariLoginPage.LOGIN_BUTTON);
		rokomariLoginPage.takeScreenShot("Login");
		assertEquals(rokomariLoginPage.getElement(rokomariLoginPage.ERROR_MESSAGE).getText(), ErrorMessage);  
	}
}
