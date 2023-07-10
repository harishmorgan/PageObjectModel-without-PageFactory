package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.DashboardPage;
import pages.LoginPage;

public class DashboardTests extends BaseTest {
	 
    LoginPage loginPage;
    DashboardPage dashboardPage;
 
    @Test(priority = 0)
    public void DasboardTest() {
 
    	loginPage = new LoginPage(driver);
 
        // login to application
    	loginPage.login("standard_user", "secret_sauce");
 
        // go the dash board page
    	dashboardPage = new DashboardPage(driver);
 
        // Verify dash board page
        Assert.assertTrue(dashboardPage.getHomePageText().contains("Products"),"we are in HomePage");
    }
 
}