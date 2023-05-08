package testcases;

import org.testng.annotations.Test;

import pages.RokomariHomePage;
import utilities.BaseDriverSetup;

public class RokomariHomePageTest extends BaseDriverSetup {
	RokomariHomePage rokomariHomePage = new RokomariHomePage();

	@Test
	public void TestHomePageScroll() {
		getDriver().get(rokomariHomePage.HOMEPAGE_URL);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		rokomariHomePage.scrollToElemnt(rokomariHomePage.payment);
//
//		try {
//			Thread.sleep(10000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

}
