package com.selenium.app.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.selenium.app.CreditorWatchApp;

public class HomePage extends AbstractPage {
    private static final Logger log = LogManager.getLogger("HomePage");

    public HomePage(CreditorWatchApp app) {
    	this.app = app;
    	app.loadBaseUrl();
    	waitUntilPageRefreshed();
    }
    
    public BlogPage goToBlog() {

    	log.info("Click 'Blog' from Navigation Bar");
    	
    	WebElement webElement = getDriver().findElement(By.linkText("Blog"));
    	webElement.click();
    	
//    	app.clickNavigationBar("Blog");
    	return new BlogPage(app);
    }

	@Override
	public boolean isPageOpen() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void waitUntilLoaded() {
		// TODO Auto-generated method stub
		
	}

}
