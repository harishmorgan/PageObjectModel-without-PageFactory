package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	 
    WebDriver driver;
 
    By userName = By.name("user-name");
 
    By password = By.name("password");
 
    By login = By.id("login-button");
 
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
 
    // Set user name in text box
    public void setUserName(String strUserName) {
        driver.findElement(userName).sendKeys(strUserName);
    }
 
    // Set password in password text box
    public void setPassword(String strPassword) {
        driver.findElement(password).sendKeys(strPassword);
    }
 
    // Click on login button
    public void clickLogin() {
        driver.findElement(login).click();
    }
 
    public String validateLoginPageTitle(){
		return driver.getTitle();
	}
    
    public void login(String strUserName, String strPasword) {
 
        // Fill user name
        this.setUserName(strUserName);
 
        // Fill password
        this.setPassword(strPasword);
 
        // Click Login button
        this.clickLogin();
    }
}