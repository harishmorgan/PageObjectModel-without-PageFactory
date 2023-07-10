package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
	 
    WebDriver driver;
 
    By homePageUserName = By.xpath("//span[contains(text(),'Products')]");
 
    public DashboardPage(WebDriver driver) {
        this.driver = driver;
 
    }
 
    // Get the User name from Home Page
    public String getHomePageText() {
        return driver.findElement(homePageUserName).getText();
    }
 
}