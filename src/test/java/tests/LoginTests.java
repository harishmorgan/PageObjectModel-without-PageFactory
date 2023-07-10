package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.DashboardPage;
import pages.LoginPage;

public class LoginTests extends BaseTest {
	 
    LoginPage loginPage;
    DashboardPage dashboardPage;
 
    @Test(priority = 0)
    public void loginTest() {
 
        // Create Login Page object
    	loginPage = new LoginPage(driver);
 
        // Verify login page text
        String loginPageTitle = loginPage.validateLoginPageTitle();
        Assert.assertEquals(loginPageTitle,"Swag Labs","we are in LoginPage");
    }
 
}